package com.example.pattern.adapter;

/**
 * 
 * ���ü̳з�ʽ�Ĳ���������
 * 
 * @author Administrator
 *
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements
		ThreePlugInterface {

	@Override
	public void powerWithThree() {
		System.out.println("�����̳�������");
		this.powerWithTwo();
	}

}
