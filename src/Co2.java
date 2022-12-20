public class Co2 {
    private double[][] co2_data;

    private int acumulador_co2;

    public Co2(){
        this.co2_data = new double[48][2];
        this.acumulador_co2 = 0;
    }

    public void add_data(double reading_time, double read_co2) {

        /*função: quem vai entrar em que posição pra usar com os dados na main*/
        this.co2_data[this.acumulador_co2][0] = reading_time;
        this.co2_data[this.acumulador_co2][1] = read_co2;
        this.acumulador_co2++;

    }
}
