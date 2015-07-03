package com.Msg;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseTask {
	/**
	 * 返回处理结果出口
	 * @return
	 */
	public Map getHandledMap(){ System.out.println("from base msg"); return new HashMap();}
}
