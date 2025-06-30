package com.matteo.gateopener.classifier;
// Generated with Weka 3.8.6
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Fri Jun 13 11:10:40 CEST 2025

//NB
//p = 0 -> Berto
//p = 1 -> Iazze
//p = 2 -> MatteBarba
//p = 3 -> MatteTornar

class WekaClassifier {

    public static double classify(double[] i) {

        double p = Double.NaN;
        p = WekaClassifier.N1c147194347(i);
        return p;
    }
    static double N1c147194347(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -1.841976) {
            p = 3;
        } else if (i[8] > -1.841976) {
            p = WekaClassifier.N3a561c33348(i);
        }
        return p;
    }
    static double N3a561c33348(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 5.6416) {
            p = WekaClassifier.N43679776349(i);
        } else if (i[1] > 5.6416) {
            p = WekaClassifier.N74a0bd2f351(i);
        }
        return p;
    }
    static double N43679776349(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 0;
        } else if (i[2] <= 4.230667) {
            p = WekaClassifier.N4b87fd1a350(i);
        } else if (i[2] > 4.230667) {
            p = 2;
        }
        return p;
    }
    static double N4b87fd1a350(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 1.179912) {
            p = 3;
        } else if (i[1] > 1.179912) {
            p = 0;
        }
        return p;
    }
    static double N74a0bd2f351(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 4.445785) {
            p = WekaClassifier.N7e1d900c352(i);
        } else if (i[2] > 4.445785) {
            p = 0;
        }
        return p;
    }
    static double N7e1d900c352(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 62.762997) {
            p = 2;
        } else if (i[0] > 62.762997) {
            p = WekaClassifier.N1be749e353(i);
        }
        return p;
    }
    static double N1be749e353(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 71.491756) {
            p = 1;
        } else if (i[0] > 71.491756) {
            p = WekaClassifier.N75a5269e354(i);
        }
        return p;
    }
    static double N75a5269e354(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= 0.819309) {
            p = WekaClassifier.N41db4c0355(i);
        } else if (i[3] > 0.819309) {
            p = 1;
        }
        return p;
    }
    static double N41db4c0355(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -0.730794) {
            p = WekaClassifier.N1692d9bf356(i);
        } else if (i[6] > -0.730794) {
            p = WekaClassifier.N64fa4577357(i);
        }
        return p;
    }
    static double N1692d9bf356(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 9.225784) {
            p = 3;
        } else if (i[1] > 9.225784) {
            p = 1;
        }
        return p;
    }
    static double N64fa4577357(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 87.712865) {
            p = 2;
        } else if (i[0] > 87.712865) {
            p = 1;
        }
        return p;
    }
}
