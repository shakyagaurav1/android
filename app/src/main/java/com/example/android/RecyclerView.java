package com.example.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class RecyclerView extends AppCompatActivity {

    private androidx.recyclerview.widget.RecyclerView contactsRecView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        contactsRecView = findViewById(R.id.recyclerView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Dwayne Johnson","dwayne@johnson.com","https://www.google.com.np/search?q=dwayne+johnson&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjlqeLAyv3xAhU3zjgGHT7HBF8Q_AUoAXoECAEQAw&biw=1366&bih=657#imgrc=iMYjUqFsmdKSKM.jpg"));
        contacts.add(new Contact("Johnny Depp","johnny@depp.com","https://i.guim.co.uk/img/media/5827279817bdc9e8c7b655c8f6798c2d53ca1170/0_21_3000_1801/master/3000.jpg?width=1020&quality=85&auto=format&fit=max&s=5db1746fc50ef3dbf65d6ebc5f96665b"));
        contacts.add(new Contact("Emma Stone","emma@stone.com","https://m.economictimes.com/thumb/msid-75534218,width-1200,height-900,resizemode-4,imgsize-524277/emma-stone-shared-a-mental-health-advice-for-people-during-the-pandemic-urging-them-to-spend-more-time-writing-instead-of-fretting-.jpg"));
        contacts.add(new Contact("Jenifer lawrence","jenifer@lawrence.com","https://www.biography.com/.image/ar_1:1%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cq_auto:good%2Cw_1200/MTQzMjgyNDgwNjIxODIzNTU5/jennifer-lawrence_gettyimages-626382596jpg.jpg"));

        ContactRecViewAdapter contactRecViewAdapter = new ContactRecViewAdapter(this);

        contactRecViewAdapter.setContacts(contacts);

        contactsRecView.setAdapter(contactRecViewAdapter);

        // programatically managed layout
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}