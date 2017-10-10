package org.xiaowu.list.test;

public class ListDemo1 {
	
	
	/**自定义集合的比较方法*/ 
	/*private static void ListSort(List<Auction> list) {
		Collections.sort(list, new Comparator<Auction>() {
			@Override
			public int compare(Auction o1, Auction o2) {
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				try {
					Date dt1 = format.parse(o1.startTime().toString());
					Date dt2 = format.parse(o2.startTime().toString());
					if (dt1.getTime() > dt2.getTime()) {
						return 1;
					} else if (dt1.getTime() < dt2.getTime()) {
						return -1;
					} else {
						return 0;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				return 0;
			}
		});
	}*/
	
}
