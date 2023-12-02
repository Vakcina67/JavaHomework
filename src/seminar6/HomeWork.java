package seminar6;

import java.util.Map;
import java.util.NoSuchElementException;

public class HomeWork {

    /**
     * Класс документ - описывает структуру документа.
     *
     * Нужно спроектировать систему отчетов, которая будет формировать отчеты для документа.
     *
     * 1. Формирование PDF-файла (потенциально может быть несколько типом разметки PDF-файла).
     * 2. Формирование JSON-файла с полями документа.
     * 3. Формирование XML-файла с полями документа.
     * 4. ... потенциально могут добавляться разные типы отчетов.
     *
     * После реализации задать себе 2 вопроса и прикрепить их к сданной ДЗ:
     * 1. Насколько сложно добавить поддержку нового типа отчета?
     * 2. Как будет выглядеть проект, если в нем будет 1000+ типов отчетов?
     *
     *
     */
    public static void main(String[] args) {
        new ReportService(Map.of(
                "pdf", new PdfReport(),
                "json", new JsonReport(),
                "xml", new XmlReport(),
                "pdf_1", new Pdf_1Report()
        ));
    }
    static class ReportService {

        private final Map<String, Report> reportMap;

        public  ReportService(Map<String, Report> reportMap) {
            this.reportMap = reportMap;
        }

        public byte[] createReport(Document document, String reportType) {
            Report report = reportMap.get(reportType);
            if (report == null) {
                throw new NoSuchElementException("Нет типа отчета " + reportType + " !");
            }
            return report.createReport(document);
        }

    }

    interface Report {
        byte[] createReport(Document document);
    }

    static class PdfReport implements Report {
        @Override
        public byte[] createReport(Document document) {
            byte[] data = null;
            return data;
        }
    }

    static class JsonReport implements Report {
        @Override
        public byte[] createReport(Document document) {
            byte[] data = null;
            return data;
        }
    }

    static class XmlReport implements Report {
        @Override
        public byte[] createReport(Document document) {
            byte[] data = null;
            return data;
        }
    }

    static class Pdf_1Report extends PdfReport {
    }

    static class Document {
        private long id;
        private String number;
        // ...
    }

}

