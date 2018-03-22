/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniautonoma.sioat.servicio;

import co.edu.uniautonoma.sioat.datos.util.ExtJSReturnUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import javax.servlet.ServletContext;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author admin
 */
@Service
public class ReporteServicio {

    @Autowired
    private ServletContext servletContext;

    public ResponseEntity<byte[]> descargarPlantillaCifras() throws FileNotFoundException, IOException {
        URL res = servletContext.getClassLoader().getResource("plantilla");
        String nombreArchivo = "PLANTILLA_SIOAT.xlsx";
        InputStream ExcelFileToRead = new FileInputStream(res.getPath().replace("%20", " ") + File.separator + nombreArchivo);
        byte[] out = null;
        out = IOUtils.toByteArray(ExcelFileToRead);
        HttpHeaders respHeaders = new HttpHeaders();
        respHeaders.add("content-disposition", "attachment; filename=" + nombreArchivo);
        respHeaders.setContentType(MediaType.valueOf("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"));
        ResponseEntity<byte[]> respo = new ResponseEntity(out, respHeaders, HttpStatus.OK);
        ExcelFileToRead.close();
        return respo;
    }

    public @ResponseBody
    Map<String, Object> cargarPlantillaCifras(MultipartFile file) throws IOException {
        XSSFWorkbook workbook = null;
        InputStream is = file.getInputStream();
        //String contentType = URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(file.getBytes()));
        try {
            workbook = new XSSFWorkbook(is);
        } catch (IOException e) {
            return ExtJSReturnUtil.mapError("errorformato");
        }
        Integer fila = -1;
        Sheet sheet = workbook.getSheetAt(0);
        int numberRows = sheet.getPhysicalNumberOfRows();
        Integer lineasTotales = numberRows - 1;
        /*  recuperación de valor de activo total*/
        Row headerActivo = sheet.getRow(5 + fila);
        String totalActivos = headerActivo.getCell(2 + fila) != null ? headerActivo.getCell(2 + fila).getStringCellValue() : "";
        double sumaActivo = headerActivo.getCell(3 + fila) != null ? headerActivo.getCell(3 + fila).getNumericCellValue() : 0;
        /*  recuperación de valor de pasivo total*/
        Row headerPasivo = sheet.getRow(6 + fila);
        String totalPasivos = headerPasivo.getCell(2 + fila) != null ? headerPasivo.getCell(2 + fila).getStringCellValue() : "";
        double sumaPasivo = headerPasivo.getCell(3 + fila) != null ? headerPasivo.getCell(3 + fila).getNumericCellValue() : 0;

        System.out.println("DATOS RECUPERADOS ACTIVOS: " + totalActivos + ":" + sumaActivo);
        System.out.println("DATOS RECUPERADOS PASIVOS: " + totalPasivos + ":" + sumaPasivo);
        return null;
    }
}
