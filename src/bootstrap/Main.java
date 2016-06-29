package src.bootstrap;

import src.priority.A;
import src.priority.B;
import src.priority.C;
import src.priority.D;
import src.priority.E;
import src.priority.Letter;

public class Main {
	
	private long number ;
	private Letter a = new A(5);
	private Letter b = new B(1); 
	private Letter c = new C(1);
	private Letter d = new D(3);
	private Letter e = new E(0);
	private Letter[] letters = {a,b,c,d,e};
//	private Letter[] letters = {a,b,c};
	public static void main(String[] args) {
		
		Main main = new Main();
		for (int i = 0; i <100; i++) {
			main.main();
		}
		
		System.out.println("-------------------"+main.number);
		for (int i = 0; i < main.letters.length; i++) {
			System.out.println(main.letters[i]+"---"+main.letters[i].getNumber());
		}
	}
	public  void main() {
		this.number++;
		
		Letter letter = getLetter(number);
		letter.plus();
		
		System.out.println("+++"+this.number);
		for (int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]+"---"+letters[i].getNumber());
		}
		
	}
	
	/**
	 * 
	 * @param number  总数
	 * @return
	 */
	public  Letter getLetter(long number) {
//		int [] arr = new int[]{0,0,0,0,0};
//		int ap = a.getPriority();
//		int bp = b.getPriority();
//		int cp = c.getPriority();
//		int dp = d.getPriority();
//		int ep = e.getPriority();
//		
//		int am = a.getNumber()/ap;
//		int bm = b.getNumber()/bp;
//		int cm = c.getNumber()/cp;
//		int dm = d.getNumber()/dp;
//		int em = e.getNumber()/ep;
//		
//		arr[0] = am;
//		arr[1] = bm;
//		arr[2] = cm;
//		arr[3] = dm;
//		arr[4] = em;
//		Arrays.sort(arr);
		
//		Arrays.sort(letters, 0, letters.length-1, c);
		List<Letter> ls =  Arrays.asList(letters);
		Collections.sort(ls, new Comparator<Letter>() {
			@Override
			public int compare(Letter f, Letter s) {
				int i = 0 ;
				if (f.getPriority() == 0 || s.getPriority() == 0) {  //将优先级为0的放到最后面
					return 1;
				} 
				int fbs = f.getNumber()/f.getPriority();
				int sbs = s.getNumber()/s.getPriority();
				if (fbs > sbs) {					 //总数占比高的向后排
					i = 1;
				}else  if (fbs < sbs) {
					i = -1 ;
				}else {//倍数相等
					if (f.getPriority() > s.getPriority()) { // 判断优先级  高的向前排
						i = -1 ;
					}else if (f.getPriority() < s.getPriority()) { // 判断优先级
						i = 1 ;
					}else {  // == 
						i = 0;
					}
				}
				return i;
			}
		});
		return ls.get(0);
	}


}
