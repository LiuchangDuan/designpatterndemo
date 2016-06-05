package com.example.pattern.adapter;

/**
 * 
 * ����ת����Ĳ���������
 * 
 * @author Administrator
 *
 */
public class TwoPlugAdapter implements ThreePlugInterface {
	
	private GBTwoPlug plug;
	
	public TwoPlugAdapter(GBTwoPlug plug) {
		this.plug = plug;
	}

	@Override
	public void powerWithThree() {
		System.out.println("ͨ��ת��");
		plug.powerWithTwo();
	}

}
