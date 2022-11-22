package com.lxh.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lxh.arouter_annotations.ARouter;
import com.lxh.common.spi.IPrinter;
import com.lxh.order.spi.OrderPrint;

import java.util.ServiceLoader;

@ARouter(path = "/app/login")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ServiceLoader<IPrinter> printers = ServiceLoader.load(IPrinter.class);
        for (IPrinter printer : printers) {
            printer.print();
        }
    }
}