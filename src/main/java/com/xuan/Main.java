package com.xuan;

import com.xuan.core.bazi.BaZi;
import com.xuan.core.bazi.BaZiSetting;
import com.xuan.core.liuyao.LiuYao;
import com.xuan.core.liuyao.LiuYaoSetting;
import com.xuan.core.qimen.zhuan.ZhuanQiMen;
import com.xuan.core.qimen.zhuan.ZhuanQiMenSetting;

import java.util.Date;

/**
 * @author Coaixy
 * @createTime 2025-02-25
 * @packageName com.xuan
 **/


public class Main {
    public static void main(String[] args) {
        // 拆补法奇门遁甲
        ZhuanQiMenSetting zhuanQiMenSetting = new ZhuanQiMenSetting();
        zhuanQiMenSetting.setQiMenType(4);
        ZhuanQiMen zhuanQiMen = new ZhuanQiMen(zhuanQiMenSetting);
        System.out.println(zhuanQiMen);
        // 置润法奇门遁甲
        zhuanQiMenSetting = new ZhuanQiMenSetting();
        zhuanQiMenSetting.setQiMenType(4);
        zhuanQiMen = new ZhuanQiMen(zhuanQiMenSetting);
        System.out.println(zhuanQiMen);
        // 八字排盘
        BaZiSetting baZiSetting = new BaZiSetting();
        baZiSetting.setDate(new Date());
        BaZi baZi = new BaZi(baZiSetting);
        System.out.println(baZi);
        // 六爻排盘
        LiuYaoSetting liuYaoSetting = new LiuYaoSetting();
        LiuYao liuYao = new LiuYao(liuYaoSetting);
        System.out.println(liuYao);
        // ...以此类推
    }
}
