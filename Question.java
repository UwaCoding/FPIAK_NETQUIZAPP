package com.example.wiedytp.fpiak_netquizapp;

import android.app.Activity;

/**
 * Created by wiedytp on 5/12/17.
 */

public class Question extends Activity {


        private int ID;
        private String QUESTION;
        private String OPTA;
        private String OPTB;
        private String OPTC;

        private String ANSWER;


        public Question() {
            ID = 0;
            QUESTION = "";
            OPTA = "";
            OPTB = "";
            OPTC = "";

            ANSWER = "";

        }

        public Question(String qUESTION, String oPTA, String oPTB, String oPTC,
                        String aNSWER) {
            QUESTION = qUESTION;
            OPTA = oPTA;
            OPTB = oPTB;
            OPTC = oPTC;

            ANSWER = aNSWER;

        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getQUESTION() {
            return QUESTION;
        }

        public void setQUESTION(String QUESTION) {
            this.QUESTION = QUESTION;
        }

        public String getOPTA() {
            return OPTA;
        }

        public void setOPTA(String OPTA) {
            this.OPTA = OPTA;
        }

        public String getOPTB() {
            return OPTB;
        }

        public void setOPTB(String OPTB) {
            this.OPTB = OPTB;
        }

        public String getOPTC() {
            return OPTC;
        }

        public void setOPTC(String OPTC) {
            this.OPTC = OPTC;
        }

        public String getANSWER() {
            return ANSWER;
        }

        public void setANSWER(String ANSWER) {
            this.ANSWER = ANSWER;
        }
    }

// @Override
// public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
// getMenuInflater().inflate(R.menu.main, menu);
// return true;
// }



