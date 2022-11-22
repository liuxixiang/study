package com.lxh.order.spi

import android.util.Log
import com.google.auto.service.AutoService
import com.lxh.common.spi.IPrinter

/**
 * @Description:
 * @author: liuxihui
 * @date 2022/11/21
 */
@AutoService(IPrinter::class)
class OrderPrint : IPrinter {
	override fun print() {
		Log.e("lxh","OrderPrint")
	}
}