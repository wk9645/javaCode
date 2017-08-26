package com.wk.entity;

import com.wk.service.INetService;


/**
 * �����ײ�
 */


public class NetPackage extends ServicePackage implements INetService{

	
	private int flow = 3;
	
	@Override
	public double netPlay(MobileCard card) {
		
		int realFlow = card.getRealFlow();
		if(realFlow >= flow){
			price+= 0.1 * (realFlow - flow * 1024);
			flow = 0;
		}else {
			flow = realFlow - flow;
		}
		return price;
	}

	
	@Override
	public void showInfo() {
		
		System.out.println("�����ײͣ���������Ϊ3GB/��" );
		
	}
}
