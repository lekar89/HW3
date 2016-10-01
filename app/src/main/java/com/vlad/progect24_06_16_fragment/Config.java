package com.vlad.progect24_06_16_fragment;

import com.vlad.progect24_06_16_fragment.model.Store;
import com.vlad.progect24_06_16_fragment.model.Tool;

import java.util.ArrayList;

/**
 * Created by Влад on 24.09.2016.
 */
public class Config {
    private static final String[] BRAND = {
            "Михаил Булгаков","Михаил Булгаков","Эрнест Хемингуей","Эрнест Хемингуей",
            "Энтони Берджес","Джорж Оруэлл","Михаил Шолохов",
            "Джорж Мартин","Братья Стругацкие","Братья Стругацкие",
            "Антон Чехов","Антон Чехов", "J R R Tolkien","J R R Tolkien","J R R Tolkien"};

    private static final String[] MODEL = {
            "Морфий","Белая гвардия","Прощай оружие","По ком звонит колокол",
            "Заводной апельсин","1984","Тихий Дон",
            "Игра престолов","Пикник на обочине","Трудно быть богом",
            "Палата №6","Жалобная книга", "Lord of the Rings: The Fellowship of the Ring",
            "Lord of the Rings: The Two Towers",
            "Lord of the Rings: The Return of the King"};
    private static final String[] IMAGEURL = {
            "Михаил Булгаков","Михаил Булгаков","Эрнест Хемингуей","Эрнест Хемингуей",
            "Энтони Берджес","Джорж Оруэлл","Михаил Шолохов",
            "Джорж Мартин","Братья Стругацкие","Братья Стругацкие",
            "Антон Чехов","Антон Чехов", "J R R Tolkien","J R R Tolkien","J R R Tolkien"};

    private static final String[] TYPE = {
            "Морфий","Белая гвардия","Прощай оружие","По ком звонит колокол",
            "Заводной апельсин","1984","Тихий Дон",
            "Игра престолов","Пикник на обочине","Трудно быть богом",
            "Палата №6","Жалобная книга", "Lord of the Rings: The Fellowship of the Ring",
            "Lord of the Rings: The Two Towers",
            "Lord of the Rings: The Return of the King"};
    private static final double [] PRICE = {
            0.20, 0.21, 0.22, 0.23, 0.24,
            0.25, 0.26, 0.27, 0.28, 0.29, 0.30,
            0.31, 0.32,  0.33, 0.34, 0.35};

    private static final int[] QUANTITY = {
            20, 21, 22, 23, 24,
            25, 26, 27, 28, 29, 30,
            31, 32,  33, 34, 35};
    public ArrayList getToolsData(){
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i<BRAND.length; i++){
            arrayList.add(new Tool()
                    .setBrand(BRAND[i])
                    .setModel(MODEL[i])
//                    .setImageUrl(IMAGEURL[i])
                    .setType(TYPE[i])
                    .setPrice(PRICE[i])
                    .setQuantity(QUANTITY[i]));
        }
        return arrayList;
    }

    private static final String[] NAMESTORE = {
            "Store 1","Store 2","Store 1","Store 3",
            "Store 4","Store 5","Store 6"};
    private static final String[] PHONESTORE = {
            "0563335501","0563335502","0563335501","0563335503",
            "0563335504","0563335505","0563335506"};
    private static final String[] MAILSTORE = {
            "Store1@i.ua","Store2@i.ua","Store1@i.ua","Store3@i.ua",
            "Store4@i.ua","Store5@i.ua","Store6@i.ua"};
    public ArrayList getStoreData(){
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i<NAMESTORE.length; i++){
            arrayList.add(new Store()
                    .setName(NAMESTORE[i])
                    .setPhone(PHONESTORE[i])
                    .setAddress(MAILSTORE[i]));
        }
        return arrayList;
    }
}
