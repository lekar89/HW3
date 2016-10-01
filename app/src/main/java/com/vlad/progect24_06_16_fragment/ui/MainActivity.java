package com.vlad.progect24_06_16_fragment.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.vlad.progect24_06_16_fragment.R;
import com.vlad.progect24_06_16_fragment.ui.fragment.StoreFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
//AppCompatActivity Биилиотека содержажая ActionBar Toolbar Материальный дизайн
// дизайн-язык и стиль компании Гугл, выпущенный 25 июня 2014 года
//    НУЖНО добавлять в  build.gradle:
//    dependencies {
//        compile 'com.android.support:appcompat-v7:23.0.0'
//    }
// NavigationView навигационная панель слева при нажатии на гамбургер или движением сллева к центру(Свайп)
    public StoreFragment storeFragment;
    // переменная класа StoreFragment

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //метод вызываемый первым подключаем макет
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // перменная toolbar приводится к типу Toolbar и находится по id
        //Toolbar елемент вью полоса вверху экрана
        setSupportActionBar(toolbar);
        //вывод toolbar на екшен бар



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //   перменная drawer приводится к типу DrawerLayout и находится по id
        // Drawer-перевод выдвижной ящик


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        //ActionBarDrawerToggle позволяет выводить NavigationView при нажании значка в заголовке программы
        //this-эта активность является хостом для панели
        //drawer-премення класа DrawerLayout
        // toolbar перменная toolbar  класа
        //R.string.navigation_drawer_open строковый ресурс, описывающий действие выдвижения (accessibility)
        //R.string.navigation_drawer_close строковый ресурс, описывающий действие закрытия (accessibility)

        drawer.setDrawerListener(toggle);
        //при нажании значка в заголовке программы выводится NavigationView
        toggle.syncState();
        // без него проблемы  с дровером

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        // перменная navigationView приводится к типу NavigationView и находится по id
        navigationView.setNavigationItemSelectedListener(this);
        //листенер в этом класе

        storeFragment= new StoreFragment();
        //создается обьект класа StoreFragment и заносится в переменную storeFragment
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        //получаем экземпляр FragmentTransaction
        fragmentTransaction.replace(R.id.container,storeFragment);
        // замещает фрагмент в контейнере другим фрагментом
        fragmentTransaction.commit();
        //commit- закончить

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
//если DrawerLayout открыть то при нажании back закрыть если нет то вызвать onBackPressed родителя
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
//создание меню
    //получает объект MenuInflater и вызываем его метод inflate() принимает  описание меню в xml, и наполняет им объект menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Обработчикему приходт выбраный пункт меню

        int id = item.getItemId();
// номер выбраного элемента

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //   перменная drawer приводится к типу DrawerLayout и находится по id
        // Drawer-перевод выдвижной ящик
        drawer.closeDrawer(GravityCompat.START);
        // закрыть панель
        return true;
    }
}
