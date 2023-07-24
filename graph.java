class graph{
    public static int estimatedTime(int totaldist, int stop)
	{
		int s = 55; // 55kmh
		int km = totaldist; 
		int t = (km*60)/s;
		return t+stop-2; //stop-2 @reason -> stop => total no. stations in the journey including source and destination station, halting time 1 min at each station so t+stop-2
	}
	public static int fair(int totaldist)
	{
		double km = totaldist/1.0;
        if(km>26){
            return 60;
        }
        else if (km>=2.0 && km<4.0) {
            return 15;
        }
		else if (km>=8 && km<10.0){
            return 35;
        }	
		else if (km>=6.0 && km<8.0){
            return 30;
        }	
		else if (km>=4.0 && km<6.0){
            return 25;
        }	
		else if (km>=10.0 && km<14.0){
            return 40;
        }	
        else if (km>=14.0 && km<18.0){
            return 45;
        }	
        else if (km>=18.0 && km<22.0){
            return 50;
        }	
        else if (km>=22.0 && km<26.0){
            return 55;
        }	
		else{
            return 10;
        }
			
	}
}