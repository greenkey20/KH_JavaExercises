package com.kh.teamwork2.restaurant.controller;

import com.kh.teamwork2.restaurant.model.vo.*;

public class RestaurantController {

	private int guestCount = 5;
	private int guests = 0;
	private Person[] ps = new Person[2];

	public void hereGuest(Guest g, int i) {
		this.guestCount -= i;
		this.guests = i;
		this.ps[0] = g;
		this.ps[1] = new Chef(0);
	}

	public void order() {
		int price = guests * 9000;
		if (ps[0].getMoney() < price) {
			System.out.println("돈이 부족하여 국밥을 주문할 수 없습니다. 나가!!!");
			return;
		}
		for (int i = 0; i <= ps.length - 1; i++) {
			System.out.println(ps[i].order());
			if (i == 0)
				ps[i].setMoney(ps[i].getMoney() - price);
			else
				ps[i].setMoney(ps[i].getMoney() + price);
		}
		System.out.println("크 ~~ 이게 국밥이지~~");
	}

	public int getBalance(int b) {
		if (b == 2)
			return ps[0].getMoney();
		else
			return ps[1].getMoney();
	}

	public int guestCount() {
		return guestCount;
	}

}
