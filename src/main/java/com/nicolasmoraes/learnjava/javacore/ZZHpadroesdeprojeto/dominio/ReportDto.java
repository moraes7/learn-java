package com.nicolasmoraes.learnjava.javacore.ZZHpadroesdeprojeto.dominio;

// Padrões de Projeto pt 06 - Data Transfer Object

public class ReportDto {
    private String aircraftName;
    private Country aircraftCountry;
    private Currency currency;
    private String personName;


    public static final class ReportDtoBuilder {
        private String aircraftName;
        private Country aircraftCountry;
        private Currency currency;
        private String personName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder aircraftCountry(Country aircraftCountry) {
            this.aircraftCountry = aircraftCountry;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.aircraftCountry = this.aircraftCountry;
            reportDto.personName = this.personName;
            reportDto.aircraftName = this.aircraftName;
            reportDto.currency = this.currency;
            return reportDto;
        }
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "aircraftName='" + aircraftName + '\'' +
                ", aircraftCountry=" + aircraftCountry +
                ", currency=" + currency.getSymbol() +
                ", personName='" + personName + '\'' +
                '}';
    }
}
