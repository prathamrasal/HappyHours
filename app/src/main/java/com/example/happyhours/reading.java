package com.example.happyhours;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class reading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);

    }
    public void couragedisliked(View view){
        gotoUrl("https://res.cloudinary.com/dusrmawop/image/upload/v1650957552/Courage_to_be_Disliked_vml86w.pdf");
    }

    public void searchofLostTime(View view) {
        gotoUrl("https://res.cloudinary.com/dusrmawop/image/upload/v1650957550/In_Search_of_Lost_Time_vhh5ud.pdf");
    }

    public void thinkAndGrowRich(View view) {
        gotoUrl("https://res.cloudinary.com/dusrmawop/image/upload/v1650958019/Think-And-Grow-Rich_edyjpy.pdf");
    }

    public void the4hourweek(View view) {
        gotoUrl("https://res.cloudinary.com/dusrmawop/image/upload/v1650958057/the-4-hour-workweek-expanded-and-updated-by-timothy-ferriss_ck0gqa.pdf");
    }

    public void mansSearchForMeaning(View view) {
        gotoUrl("https://res.cloudinary.com/dusrmawop/image/upload/v1650958362/Mans_Search_For_Meaning_t4ktvk.pdf");
    }

    public void wingsOfFire(View view) {
        gotoUrl("https://res.cloudinary.com/dusrmawop/image/upload/v1650958526/Wings_of_fire_PDFDrive_bsnlnl.pdf");
    }

    public void beyondTheLastMountain(View view) {
        gotoUrl("https://res.cloudinary.com/dusrmawop/image/upload/v1650958532/Beyond_the_Last_Blue_Mountains_PDFDrive_awx75s.pdf");
    }
    public void manWhoKnewInfinity(View view) {
        gotoUrl("https://res.cloudinary.com/dusrmawop/image/upload/v1650959096/Man_Who_knew_Infinity_ykpdk9.pdf");
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}

