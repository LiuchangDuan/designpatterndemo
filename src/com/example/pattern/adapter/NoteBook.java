package com.example.pattern.adapter;

public class NoteBook {
	
	private ThreePlugInterface plug;
	
	public NoteBook(ThreePlugInterface plug) {
		this.plug = plug;
	}
	
	//Ê¹ÓÃ²å×ù³äµç
	public void charge() {
		plug.powerWithThree();
	}

	public static void main(String[] args) {
		
		GBTwoPlug twoPlug = new GBTwoPlug();
		
		ThreePlugInterface threePlug = new TwoPlugAdapter(twoPlug);
		
		NoteBook noteBook = new NoteBook(threePlug);
		
		noteBook.charge();
		
		threePlug = new TwoPlugAdapterExtends();
		noteBook = new NoteBook(threePlug);
		noteBook.charge();
		
	}

}
