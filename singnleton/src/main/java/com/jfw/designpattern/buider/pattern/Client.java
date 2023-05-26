package com.jfw.designpattern.buider.pattern;

/**
 * @author jfw
 * @date 2021-09-28
 */
public class Client {
    public static void main(String[] args) {
        // 建普通房子
        CommonBuilding commonBuilding = new CommonBuilding();

        // 准备director
        HouseDirector director = new HouseDirector(commonBuilding);

        // 完成建房，得到普通房子
        House house = director.constractHouse();

        System.out.println("============================================");

        // 盖高楼
        TowerBuilding towerBuilding = new TowerBuilding();
        // 重置director
        director.setHouseBuilder(towerBuilding);
        // 完成建房，得到高楼
        house = director.constractHouse();
    }

}
