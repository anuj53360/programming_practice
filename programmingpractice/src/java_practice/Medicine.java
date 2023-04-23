//package java_practice;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Medicine {
//
//	private int id;
//	private int dose;
//	private int time;
//	private int qty;
//	private int model;
//
//
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public int getDose() {
//		return dose;
//	}
//	public void setDose(int dose) {
//		this.dose = dose;
//	}
//	public int getTime() {
//		return time;
//	}
//	public void setTime(int time) {
//		this.time = time;
//	}
//	public int getQty() {
//		return qty;
//	}
//	public void setQty(int qty) {
//		this.qty = qty;
//	}
//	public int getModel() {
//		return model;
//	}
//	public void setModel(int model) {
//		this.model = model;
//	}
//	public Medicine(int id, int dose, int time, int qty, int model) {
//		super();
//		this.id = id;
//		this.dose = dose;
//		this.time = time;
//		this.qty = qty;
//		this.model = model;
//	}
//
//
//	public static List<Medicine> calculateMedicine(List<Medicine> medicine, List<Integer> list){
//
//		int count=0;
//		List<Medicine> list1=new ArrayList<>();
//
//		for (Medicine m : medicine) {
//			if(m.id==list.get(0) && m.dose==list.get(1) && m.time==list.get(2) && m.qty ==list.get(3) && m.model ==list.get(3)) {
//				list1.add(m);
//			}
//		}
//
//
//
//		for (Integer it : list) {
//
//		for (Medicine medicine2 : medicine) {
//			if(it==medicine2.id) {
//				list1.add(medicine2);
//			}
//
//			db.medcine.find({
//				$group(dose){
//
//				}
//			});
//
//			}
//		}
//
//
//
//
//
//
//		return null;
//	}
//
//
//
//	public static void main(String[] args) {
//
//		Medicine m1=new Medicine(0, 0, 0, 1, 0);
//		Medicine m2=new Medicine(0, 0, 0, 1, 0);
//		Medicine m3=new Medicine(0, 0, 0, 0, 0);
//		Medicine m4=new Medicine(0, 1, 0, 1, 0);
//		Medicine m5=new Medicine(0, 0, 0, 0, 1);
//		List<Medicine> medicine=Arrays.asList(m1,m2,m3,m4,m5);
//		List<Integer> list=Arrays.asList(0,0,0,1,1);
//		calculateMedicine(medicine,list);
//
//
//
//
//	}
//}
