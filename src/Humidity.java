public class Humidity {
    private double[][] humidity_data;

    private int acumulador_humidity;

    public Humidity(){
        this.humidity_data = new double[48][2];
        this.acumulador_humidity = 0;
    }

    public void add_data(double reading_time, double read_humidity) {

        /*função: quem vai entrar em que posição pra usar com os dados na main*/
        this.humidity_data[this.acumulador_humidity][0] = reading_time;
        this.humidity_data[this.acumulador_humidity][1] = read_humidity;
        this.acumulador_humidity++;

    }
}
