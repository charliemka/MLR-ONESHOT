package mlroneshot;

/**
 *
 * @author Carlos Varela
 */
public class DataSet {
    double [][] data;
    
    public DataSet(double [][] _data){
        this.data = _data;
    }
    public double[][] getData(){
        return data;
    }
    public void setData(double [][] data){
        this.data = data;
    }
}
