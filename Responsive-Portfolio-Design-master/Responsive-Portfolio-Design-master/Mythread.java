class Main extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i+"Child Thread");
		}
	}	
}

class Mythread{

	public static void main(String args[]){
		Main ob=new Main();
		ob.start();
			try{
				ob.join();
			}
			catch(Exception e){}
		
		Main ok=new Main();
		ok.start();
		
		for(int i=1;i<=10;i++){
			System.out.println(i+"Main thread");
		}
	}
}