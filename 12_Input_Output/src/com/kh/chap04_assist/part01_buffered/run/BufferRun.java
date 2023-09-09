package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

import java.io.FileNotFoundException;

public class BufferRun {

	public static void main(String[] args) throws FileNotFoundException {
		
		BufferedDao bd = new BufferedDao();
//		bd.fileSave();
		bd.fileRead();

	}

}
