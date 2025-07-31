package com.pengjia.paike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品控制器
 */
@Controller // 标注为控制器
public class GoodsController {
	/**
	 * 获取商品列表
	 */
	@RequestMapping("/goods") // 请求路径
	public String goods() {
		return "goods";// 跳转到goods.ftl页面
	}
}
