public class Temperature {
    private double[][] temperature_data;

    private int acumulador_temperature;

    public Temperature(){
        this.temperature_data = new double[48][2];
        this.acumulador_temperature = 0;
    }
    public void add_data(double reading_time, double read_temperature) {

        this.temperature_data[this.acumulador_temperature][0] = reading_time;
        this.temperature_data[this.acumulador_temperature][1] = read_temperature;
        this.acumulador_temperature++;

    }
}
