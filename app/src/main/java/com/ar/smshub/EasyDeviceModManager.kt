package com.ar.smshub


import android.content.Context
import github.nisrulz.easydeviceinfo.base.EasyDeviceMod

object EasyDeviceModManager {

    private var easyDeviceMod: EasyDeviceMod? = null

    fun init(context: Context){
        easyDeviceMod = EasyDeviceMod(context)
    }

    fun getInstance(): EasyDeviceMod {
        return easyDeviceMod!!
    }

}
