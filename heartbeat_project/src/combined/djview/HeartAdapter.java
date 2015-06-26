package combined.djview;

public class HeartAdapter implements BeatModelInterface {
	HeartModelInterface heart;
 
	public HeartAdapter(HeartModelInterface heart) {
		this.heart = heart;
	}

    public void initialize() {}
  
    public void on() {}
  
    public void off() {}
   
	public int getBPM() {
		//return heart.getHeartRate();
		return heart.getCuenta();
	}
  
    public void setBPM(int bpm) {}
   
	public void registerObserver(BeatObserver o) {
		heart.registerObserver(o);
	}
    
	public void removeObserver(BeatObserver o) {
		heart.removeObserver(o);
	}
     
	public void registerObserver(BPMObserver o) {
		heart.registerObserver(o);
	}
  
	public void removeObserver(BPMObserver o) {
		heart.removeObserver(o);
	}
	
	public int[][] getMatriz(){ 
		return null;
	}

	public void registerObserver(MatrizObserver o) {
		// TODO Auto-generated method stub
		
	}

	public void removeObserver(MatrizObserver o) {
		// TODO Auto-generated method stub
		
	}
	
	public void clear()
	{
		heart.clear();
	}
}
