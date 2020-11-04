package com.wyan.common;

import com.csvreader.CsvReader;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @Auther: wyan
 * @Date: 2019/4/8 20:35
 * @Description:
 */
public class ImportUtil {


    public static List<List<Cell>> getBankListByExcel(InputStream inputStream, String originalFilename) throws Exception {
        List list = new ArrayList<>();
        //创建Excel工作薄
        Workbook work = getWorkbook(inputStream, originalFilename);
        if (null == work) {
            throw new Exception("创建Excel工作薄为空！");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;

        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if (sheet == null) {
                continue;
            }
            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {

                row = sheet.getRow(j);
                if (row == null || row.getFirstCellNum() == j) {
                    continue;
                }
                System.out.println(row.getFirstCellNum());
                List<Cell> li = new ArrayList<>();
                for (int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++) {
                    cell = row.getCell(y);
                    li.add(cell);
                }
                list.add(li);
            }
        }
        work.close();
        return list;
    }
    /**
     * 判断文件格式
     *
     * @param inStr
     * @param fileName
     * @return
     * @throws Exception
     */
    public static Workbook getWorkbook(InputStream inStr, String fileName) throws Exception {
        Workbook workbook = null;
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        if (".xls".equals(fileType)) {
            workbook = new HSSFWorkbook(inStr);
        } else if (".xlsx".equals(fileType)) {
            workbook = new XSSFWorkbook(inStr);
        } else {
            throw new Exception("请上传excel文件！");
        }
        return workbook;
    }

    /**
     * 读取excel数据
     * @param  file
     */
    public   void readExcelToClass(File file) {

        Workbook wb = null;
        try {
            wb = WorkbookFactory.create(file);
            readExcelClassInfo(wb, 0, 0, 0);
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 读取excel数据
     * @param  file
     */
    public   void readExcelToScore(File file) {

        Workbook wb = null;
        try {
            wb = WorkbookFactory.create(file);
            readExcelToScore(wb, 0, 0, 0,file.getName());
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 读取excel文件
     * @param  wb
     * @param sheetIndex sheet页下标：从0开始
     * @param startReadLine 开始读取的行:从0开始
     * @param tailLine 去除最后读取的行
     */
    private  void readExcelToScore(Workbook wb, int sheetIndex, int startReadLine, int tailLine, String fileName) {

        Sheet sheet = wb.getSheetAt(sheetIndex);
        Row row = null;
        String courseyear = "";
        String coursesge="";
        String course1 = "";
        String course2 =  "";
        String course3 = "";
        String course4 = "";
        String course5 = "";
        String course6 = "";
        String course7 = "";
        String course8 = "";
        String course9 = "";
        String courseCredit1 = "";
        String courseCredit2 =  "";
        String courseCredit3 = "";
        String courseCredit4 = "";
        String courseCredit5 = "";
        String courseCredit6 = "";
        String courseCredit7 = "";
        String courseCredit8 = "";
        String courseCredit9 = "";
        for(int i=startReadLine; i<sheet.getLastRowNum()-tailLine+1; i++) {

            row = sheet.getRow(i);
            //每一条学生成绩row需要创建9个对象 作为九门功课成绩
            //开始解析每一条表格记录
            String cellValue = getCellValue(row.getCell(1));
            int cellRow = 0;

            //解析成绩的年份
            if(cellValue.startsWith("年级：")){
                courseyear=fileName.substring(0,4);
                coursesge=fileName.substring(6,10);
                cellRow=i;
            }else
                //包含课程的名称 取出来
                if(cellValue.trim().equals("")&&i==cellRow+1){
                    course1 = getCellValue(row.getCell(4)).trim();
                    course2 = getCellValue(row.getCell(5)).trim();
                    course3 = getCellValue(row.getCell(6)).trim();
                    course4 = getCellValue(row.getCell(7)).trim();
                    course5 = getCellValue(row.getCell(8)).trim();
                    course6 = getCellValue(row.getCell(9)).trim();
                    course7 = getCellValue(row.getCell(10)).trim();
                    course8 = getCellValue(row.getCell(11)).trim();
                    course9 = getCellValue(row.getCell(12)).trim();
                }else
                    //包含课程的学分 取出来
                    if(cellValue.startsWith("学生")){
                        courseCredit1 = getCellValue(row.getCell(4)).trim();
                        courseCredit2 = getCellValue(row.getCell(5)).trim();
                        courseCredit3 = getCellValue(row.getCell(6)).trim();
                        courseCredit4 = getCellValue(row.getCell(7)).trim();
                        courseCredit5 = getCellValue(row.getCell(8)).trim();
                        courseCredit6 = getCellValue(row.getCell(9)).trim();
                        courseCredit7 = getCellValue(row.getCell(10)).trim();
                        courseCredit8 = getCellValue(row.getCell(11)).trim();
                        courseCredit9 = getCellValue(row.getCell(12)).trim();
                    }else if(row.getCell(1).getCellType()== Cell.CELL_TYPE_NUMERIC){


                    }
            //存储9条学生记录



        }

    }

    /**
     * 读取excel文件
     * @param  wb
     * @param sheetIndex sheet页下标：从0开始
     * @param startReadLine 开始读取的行:从0开始
     * @param tailLine 去除最后读取的行
     */
    private  void readExcelClassInfo(Workbook wb, int sheetIndex, int startReadLine, int tailLine) {

        Sheet sheet = wb.getSheetAt(sheetIndex);
        Row row = null;

        for(int i=startReadLine; i<sheet.getLastRowNum()-tailLine+1; i++) {
            //获取当前的年和月份 计算学期
            String teamAge = "";
            Calendar cale =  Calendar.getInstance();
            int year = cale.get(Calendar.YEAR);
            int month = cale.get(Calendar.MONTH) + 1;
            if(month>=8){
                teamAge = year+"年第一学期";
            }else{
                teamAge = year-1+"年第二学期";
            }
            //一个班级最多保存五条记录 上午 1 2 下午 3 4 晚上 5
            row = sheet.getRow(i);
            int classIndex = 1;
            //2  7 12 17 22 27 32 37
            for(Cell c : row) {
                c.setCellType(Cell.CELL_TYPE_STRING);
                boolean isMerge = isMergedRegion(sheet, i, c.getColumnIndex());
                //判断是否具有合并单元格
                if(isMerge) {
                    String rs = getMergedRegionValue(sheet, row.getRowNum(), c.getColumnIndex());
                    System.out.print(rs + "  ");
                }else {
                    System.out.println(c.getColumnIndex()+"=="+c.getRichStringCellValue());
                    if(c.getColumnIndex()==1){
                        String name = c.getRichStringCellValue().toString();
                        name=name.substring(0,name.length()-4);

                    }
                }
            }
            System.out.println("一行结束开始存储5条数据");
            System.out.println("结束存储5条数据");
        }

    }

    /**
     * 获取合并单元格的值
     * @param sheet
     * @param row
     * @param column
     * @return
     */
    public   String getMergedRegionValue(Sheet sheet , int row , int column){

        int sheetMergeCount = sheet.getNumMergedRegions();

        for(int i = 0 ; i < sheetMergeCount ; i++){
            CellRangeAddress ca = sheet.getMergedRegion(i);
            int firstColumn = ca.getFirstColumn();
            int lastColumn = ca.getLastColumn();
            int firstRow = ca.getFirstRow();
            int lastRow = ca.getLastRow();

            if(row >= firstRow && row <= lastRow){

                if(column >= firstColumn && column <= lastColumn){
                    Row fRow = sheet.getRow(firstRow);
                    Cell fCell = fRow.getCell(firstColumn);
                    return getCellValue(fCell) ;
                }
            }
        }

        return null ;
    }

    /**
     * 判断合并了行
     * @param sheet
     * @param row
     * @param column
     * @return
     */
    private  boolean isMergedRow(Sheet sheet, int row , int column) {

        int sheetMergeCount = sheet.getNumMergedRegions();
        for (int i = 0; i < sheetMergeCount; i++) {
            CellRangeAddress range = sheet.getMergedRegion(i);
            int firstColumn = range.getFirstColumn();
            int lastColumn = range.getLastColumn();
            int firstRow = range.getFirstRow();
            int lastRow = range.getLastRow();
            if(row == firstRow && row == lastRow){
                if(column >= firstColumn && column <= lastColumn){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 判断指定的单元格是否是合并单元格
     * @param sheet
     * @param row 行下标
     * @param column 列下标
     * @return
     */
    private  boolean isMergedRegion(Sheet sheet, int row , int column) {

        int sheetMergeCount = sheet.getNumMergedRegions();
        for (int i = 0; i < sheetMergeCount; i++) {

            CellRangeAddress range = sheet.getMergedRegion(i);
            int firstColumn = range.getFirstColumn();
            int lastColumn = range.getLastColumn();
            int firstRow = range.getFirstRow();
            int lastRow = range.getLastRow();
            if(row >= firstRow && row <= lastRow){
                if(column >= firstColumn && column <= lastColumn){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 判断sheet页中是否含有合并单元格
     * @param sheet
     * @return
     */
    private  boolean hasMerged(Sheet sheet) {
        return sheet.getNumMergedRegions() > 0 ? true : false;
    }

    /**
     * 合并单元格
     * @param sheet
     * @param firstRow 开始行
     * @param lastRow 结束行
     * @param firstCol 开始列
     * @param lastCol 结束列
     */
    private  void mergeRegion(Sheet sheet, int firstRow, int lastRow, int firstCol, int lastCol) {
        sheet.addMergedRegion(new CellRangeAddress(firstRow, lastRow, firstCol, lastCol));
    }

    /**
     * 获取单元格的值
     * @param cell
     * @return
     */
    public  String getCellValue(Cell cell){

        if(cell == null) return "";

        if(cell.getCellType() == Cell.CELL_TYPE_STRING){

            return cell.getStringCellValue();

        }else if(cell.getCellType() == Cell.CELL_TYPE_BOOLEAN){

            return String.valueOf(cell.getBooleanCellValue());

        }else if(cell.getCellType() == Cell.CELL_TYPE_FORMULA){

            return cell.getCellFormula() ;

        }else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC){

            return String.valueOf(cell.getNumericCellValue());

        }
        return "";
    }

    public static ArrayList<String[]> parseCsv(InputStream is) {
        try {
            ArrayList<String[]> csvList = new ArrayList<String[]>(); //用来保存数据
            //String csvFilePath = "D:\\test\\测试.csv";
            CsvReader reader = new CsvReader(is, ',', Charset.forName("GBK"));    //解决中文编码
            reader.readHeaders(); // 跳过表头   如果需要表头的话，不要写这句。
            while (reader.readRecord()) { //逐行读入除表头的数据
                csvList.add(reader.getValues());
            }
            reader.close();
            return csvList;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
