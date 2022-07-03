package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferRun {

	public static void main(String[] args) {
		
		BufferedDao bd = new BufferedDao();
//		bd.fileSave();
		bd.fileRead();

	}

}
