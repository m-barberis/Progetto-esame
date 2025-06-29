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

    public static double classify(double[] i){

        double p = Double.NaN;
        p = WekaClassifier.N7a7a8e60(i);
        return p;
    }
    static double N7a7a8e60(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -1.841976) {
            p = WekaClassifier.N2ea1e1661(i);
        } else if (i[8] > -1.841976) {
            p = WekaClassifier.N1a94371740(i);
        }
        return p;
    }
    static double N2ea1e1661(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -1.714037) {
            p = WekaClassifier.N79e5a69c2(i);
        } else if (i[6] > -1.714037) {
            p = WekaClassifier.N4619e5f14(i);
        }
        return p;
    }
    static double N79e5a69c2(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 3;
        } else if (i[7] <= 1.920585) {
            p = 3;
        } else if (i[7] > 1.920585) {
            p = WekaClassifier.N7cc382173(i);
        }
        return p;
    }
    static double N7cc382173(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 80.48468) {
            p = 1;
        } else if (i[0] > 80.48468) {
            p = 0;
        }
        return p;
    }
    static double N4619e5f14(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -2.916977) {
            p = WekaClassifier.N671286855(i);
        } else if (i[4] > -2.916977) {
            p = WekaClassifier.N5a9bb30a8(i);
        }
        return p;
    }
    static double N671286855(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= 0.453749) {
            p = WekaClassifier.N33971dbd6(i);
        } else if (i[10] > 0.453749) {
            p = 1;
        }
        return p;
    }
    static double N33971dbd6(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -2.348531) {
            p = 3;
        } else if (i[5] > -2.348531) {
            p = WekaClassifier.N53a4f2e27(i);
        }
        return p;
    }
    static double N53a4f2e27(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 6.920948) {
            p = 0;
        } else if (i[1] > 6.920948) {
            p = 1;
        }
        return p;
    }
    static double N5a9bb30a8(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -0.397919) {
            p = WekaClassifier.N294e20729(i);
        } else if (i[5] > -0.397919) {
            p = WekaClassifier.N1b0e983a24(i);
        }
        return p;
    }
    static double N294e20729(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 3;
        } else if (i[7] <= 1.892256) {
            p = WekaClassifier.N22bfaa1310(i);
        } else if (i[7] > 1.892256) {
            p = 2;
        }
        return p;
    }
    static double N22bfaa1310(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -2.402536) {
            p = WekaClassifier.N56786f4411(i);
        } else if (i[3] > -2.402536) {
            p = WekaClassifier.N56d9ae8314(i);
        }
        return p;
    }
    static double N56786f4411(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 3;
        } else if (i[4] <= 0.02579) {
            p = WekaClassifier.N517c856212(i);
        } else if (i[4] > 0.02579) {
            p = WekaClassifier.N969728f13(i);
        }
        return p;
    }
    static double N517c856212(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 2;
        } else if (i[11] <= -2.050613) {
            p = 2;
        } else if (i[11] > -2.050613) {
            p = 3;
        }
        return p;
    }
    static double N969728f13(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 78.076067) {
            p = 2;
        } else if (i[0] > 78.076067) {
            p = 0;
        }
        return p;
    }
    static double N56d9ae8314(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= 0.931878) {
            p = WekaClassifier.N434ee95315(i);
        } else if (i[10] > 0.931878) {
            p = WekaClassifier.N11dc4f9423(i);
        }
        return p;
    }
    static double N434ee95315(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 3;
        } else if (i[2] <= 3.14341) {
            p = WekaClassifier.N76ac33cd16(i);
        } else if (i[2] > 3.14341) {
            p = WekaClassifier.N3413ca9d17(i);
        }
        return p;
    }
    static double N76ac33cd16(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 3;
        } else if (i[11] <= 1.217423) {
            p = 3;
        } else if (i[11] > 1.217423) {
            p = 0;
        }
        return p;
    }
    static double N3413ca9d17(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 2;
        } else if (i[9] <= -1.341993) {
            p = 2;
        } else if (i[9] > -1.341993) {
            p = WekaClassifier.N2f25d72a18(i);
        }
        return p;
    }
    static double N2f25d72a18(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 3;
        } else if (i[2] <= 4.350241) {
            p = 3;
        } else if (i[2] > 4.350241) {
            p = WekaClassifier.N1b95b7ec19(i);
        }
        return p;
    }
    static double N1b95b7ec19(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -0.498581) {
            p = 2;
        } else if (i[3] > -0.498581) {
            p = WekaClassifier.Ncb0dd0820(i);
        }
        return p;
    }
    static double Ncb0dd0820(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -0.46356) {
            p = WekaClassifier.N265db92121(i);
        } else if (i[5] > -0.46356) {
            p = 2;
        }
        return p;
    }
    static double N265db92121(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -1.836733) {
            p = WekaClassifier.N2740b64722(i);
        } else if (i[5] > -1.836733) {
            p = 3;
        }
        return p;
    }
    static double N2740b64722(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 6.591099) {
            p = 3;
        } else if (i[1] > 6.591099) {
            p = 2;
        }
        return p;
    }
    static double N11dc4f9423(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -2.032655) {
            p = 1;
        } else if (i[4] > -2.032655) {
            p = 3;
        }
        return p;
    }
    static double N1b0e983a24(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= 1.052026) {
            p = WekaClassifier.N50d1becb25(i);
        } else if (i[9] > 1.052026) {
            p = WekaClassifier.N4e2308e539(i);
        }
        return p;
    }
    static double N50d1becb25(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 0;
        } else if (i[12] <= 1.322427) {
            p = WekaClassifier.N7201c81826(i);
        } else if (i[12] > 1.322427) {
            p = 2;
        }
        return p;
    }
    static double N7201c81826(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= -4.855607) {
            p = 0;
        } else if (i[3] > -4.855607) {
            p = WekaClassifier.N1d2892327(i);
        }
        return p;
    }
    static double N1d2892327(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 3;
        } else if (i[7] <= 1.304312) {
            p = WekaClassifier.N6e720e6b28(i);
        } else if (i[7] > 1.304312) {
            p = WekaClassifier.N345c735535(i);
        }
        return p;
    }
    static double N6e720e6b28(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -0.267629) {
            p = WekaClassifier.N3388c28829(i);
        } else if (i[5] > -0.267629) {
            p = WekaClassifier.N4fb59de930(i);
        }
        return p;
    }
    static double N3388c28829(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 72.610158) {
            p = 2;
        } else if (i[0] > 72.610158) {
            p = 3;
        }
        return p;
    }
    static double N4fb59de930(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 3;
        } else if (i[2] <= 4.702792) {
            p = WekaClassifier.N5abb8ead31(i);
        } else if (i[2] > 4.702792) {
            p = WekaClassifier.N32145d5c34(i);
        }
        return p;
    }
    static double N5abb8ead31(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 92.424769) {
            p = WekaClassifier.N2444d2c732(i);
        } else if (i[0] > 92.424769) {
            p = 3;
        }
        return p;
    }
    static double N2444d2c732(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= 1.046886) {
            p = WekaClassifier.N512dd84533(i);
        } else if (i[10] > 1.046886) {
            p = 1;
        }
        return p;
    }
    static double N512dd84533(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -1.877183) {
            p = 3;
        } else if (i[8] > -1.877183) {
            p = 0;
        }
        return p;
    }
    static double N32145d5c34(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= 0.528235) {
            p = 0;
        } else if (i[4] > 0.528235) {
            p = 1;
        }
        return p;
    }
    static double N345c735535(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 2;
        } else if (i[11] <= -1.377575) {
            p = 2;
        } else if (i[11] > -1.377575) {
            p = WekaClassifier.N360c5df336(i);
        }
        return p;
    }
    static double N360c5df336(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= 0.507127) {
            p = WekaClassifier.N9dc448737(i);
        } else if (i[4] > 0.507127) {
            p = 0;
        }
        return p;
    }
    static double N9dc448737(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 0;
        } else if (i[5] <= -0.069598) {
            p = 0;
        } else if (i[5] > -0.069598) {
            p = WekaClassifier.N19b2065d38(i);
        }
        return p;
    }
    static double N19b2065d38(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 86.255467) {
            p = 1;
        } else if (i[0] > 86.255467) {
            p = 0;
        }
        return p;
    }
    static double N4e2308e539(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= 0.509777) {
            p = 2;
        } else if (i[3] > 0.509777) {
            p = 3;
        }
        return p;
    }
    static double N1a94371740(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 5.6416) {
            p = WekaClassifier.N7187a0be41(i);
        } else if (i[1] > 5.6416) {
            p = WekaClassifier.N3b108a76132(i);
        }
        return p;
    }
    static double N7187a0be41(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 0;
        } else if (i[2] <= 4.230667) {
            p = WekaClassifier.N780ec03d42(i);
        } else if (i[2] > 4.230667) {
            p = WekaClassifier.Nd6d294e113(i);
        }
        return p;
    }
    static double N780ec03d42(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 49.647809) {
            p = 3;
        } else if (i[0] > 49.647809) {
            p = WekaClassifier.N2ebc8bf943(i);
        }
        return p;
    }
    static double N2ebc8bf943(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 1.114527) {
            p = WekaClassifier.N15ab3db644(i);
        } else if (i[1] > 1.114527) {
            p = WekaClassifier.N16b905ce56(i);
        }
        return p;
    }
    static double N15ab3db644(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= 0.619125) {
            p = WekaClassifier.N5965fded45(i);
        } else if (i[10] > 0.619125) {
            p = WekaClassifier.N4c74319452(i);
        }
        return p;
    }
    static double N5965fded45(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= 0.452237) {
            p = WekaClassifier.N5764c1d446(i);
        } else if (i[9] > 0.452237) {
            p = WekaClassifier.N56a0a90250(i);
        }
        return p;
    }
    static double N5764c1d446(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= 0.787146) {
            p = WekaClassifier.N1dcd7b8247(i);
        } else if (i[4] > 0.787146) {
            p = 3;
        }
        return p;
    }
    static double N1dcd7b8247(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 0;
        } else if (i[11] <= 0.904432) {
            p = WekaClassifier.N5147a30048(i);
        } else if (i[11] > 0.904432) {
            p = 3;
        }
        return p;
    }
    static double N5147a30048(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 0;
        } else if (i[8] <= 0.307088) {
            p = 0;
        } else if (i[8] > 0.307088) {
            p = WekaClassifier.N273bb65049(i);
        }
        return p;
    }
    static double N273bb65049(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= -0.877046) {
            p = 3;
        } else if (i[1] > -0.877046) {
            p = 0;
        }
        return p;
    }
    static double N56a0a90250(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -1.690729) {
            p = WekaClassifier.N2047d93f51(i);
        } else if (i[5] > -1.690729) {
            p = 3;
        }
        return p;
    }
    static double N2047d93f51(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 2;
        } else if (i[12] <= 0.429461) {
            p = 2;
        } else if (i[12] > 0.429461) {
            p = 3;
        }
        return p;
    }
    static double N4c74319452(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 1;
        } else if (i[6] <= 0.350035) {
            p = WekaClassifier.N3687977c53(i);
        } else if (i[6] > 0.350035) {
            p = WekaClassifier.N7b2c63ae55(i);
        }
        return p;
    }
    static double N3687977c53(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 3;
        } else if (i[12] <= 0.359691) {
            p = WekaClassifier.N653cd01754(i);
        } else if (i[12] > 0.359691) {
            p = 1;
        }
        return p;
    }
    static double N653cd01754(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 0;
        } else if (i[8] <= -0.792395) {
            p = 0;
        } else if (i[8] > -0.792395) {
            p = 3;
        }
        return p;
    }
    static double N7b2c63ae55(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= 0.857468) {
            p = 2;
        } else if (i[7] > 0.857468) {
            p = 3;
        }
        return p;
    }
    static double N16b905ce56(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= -1.359093) {
            p = WekaClassifier.N1c0f4c1257(i);
        } else if (i[4] > -1.359093) {
            p = WekaClassifier.N29552dd71(i);
        }
        return p;
    }
    static double N1c0f4c1257(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 0;
        } else if (i[5] <= 1.2552) {
            p = WekaClassifier.N1fb08bec58(i);
        } else if (i[5] > 1.2552) {
            p = 1;
        }
        return p;
    }
    static double N1fb08bec58(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= -1.228958) {
            p = WekaClassifier.N799baa759(i);
        } else if (i[7] > -1.228958) {
            p = WekaClassifier.N59d048ef60(i);
        }
        return p;
    }
    static double N799baa759(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 2;
        } else if (i[1] <= 4.737999) {
            p = 2;
        } else if (i[1] > 4.737999) {
            p = 3;
        }
        return p;
    }
    static double N59d048ef60(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 0;
        } else if (i[8] <= 1.031627) {
            p = WekaClassifier.N3f59f01b61(i);
        } else if (i[8] > 1.031627) {
            p = 1;
        }
        return p;
    }
    static double N3f59f01b61(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 0;
        } else if (i[10] <= 1.381584) {
            p = WekaClassifier.N24ade3f762(i);
        } else if (i[10] > 1.381584) {
            p = 1;
        }
        return p;
    }
    static double N24ade3f762(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 3;
        } else if (i[11] <= -0.40259) {
            p = WekaClassifier.N6eab394763(i);
        } else if (i[11] > -0.40259) {
            p = WekaClassifier.N3015f5dd68(i);
        }
        return p;
    }
    static double N6eab394763(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= -2.647344) {
            p = WekaClassifier.N35e7834d64(i);
        } else if (i[3] > -2.647344) {
            p = WekaClassifier.N454e74c265(i);
        }
        return p;
    }
    static double N35e7834d64(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 0;
        } else if (i[12] <= -0.192701) {
            p = 0;
        } else if (i[12] > -0.192701) {
            p = 3;
        }
        return p;
    }
    static double N454e74c265(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -0.196147) {
            p = WekaClassifier.Ne3795c766(i);
        } else if (i[5] > -0.196147) {
            p = 1;
        }
        return p;
    }
    static double Ne3795c766(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 1;
        } else if (i[5] <= -1.811909) {
            p = WekaClassifier.N39e1e44767(i);
        } else if (i[5] > -1.811909) {
            p = 3;
        }
        return p;
    }
    static double N39e1e44767(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 97.7434) {
            p = 1;
        } else if (i[0] > 97.7434) {
            p = 3;
        }
        return p;
    }
    static double N3015f5dd68(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= 1.377084) {
            p = WekaClassifier.N6cb7f7969(i);
        } else if (i[9] > 1.377084) {
            p = 3;
        }
        return p;
    }
    static double N6cb7f7969(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 0.280637) {
            p = 1;
        } else if (i[2] > 0.280637) {
            p = WekaClassifier.N34604bca70(i);
        }
        return p;
    }
    static double N34604bca70(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= 1.382402) {
            p = 0;
        } else if (i[6] > 1.382402) {
            p = 1;
        }
        return p;
    }
    static double N29552dd71(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -1.824704) {
            p = WekaClassifier.N1db1f44f72(i);
        } else if (i[5] > -1.824704) {
            p = WekaClassifier.N76d45dfd74(i);
        }
        return p;
    }
    static double N1db1f44f72(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -1.177458) {
            p = WekaClassifier.N40dc603773(i);
        } else if (i[3] > -1.177458) {
            p = 3;
        }
        return p;
    }
    static double N40dc603773(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 70.624236) {
            p = 2;
        } else if (i[0] > 70.624236) {
            p = 0;
        }
        return p;
    }
    static double N76d45dfd74(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= 0.7192) {
            p = WekaClassifier.N5e7ffa4075(i);
        } else if (i[9] > 0.7192) {
            p = WekaClassifier.N4e8945e695(i);
        }
        return p;
    }
    static double N5e7ffa4075(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 5.305505) {
            p = WekaClassifier.N4c7e6e4c76(i);
        } else if (i[1] > 5.305505) {
            p = WekaClassifier.N4a6c669192(i);
        }
        return p;
    }
    static double N4c7e6e4c76(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= 1.61028) {
            p = WekaClassifier.N6f80622c77(i);
        } else if (i[3] > 1.61028) {
            p = WekaClassifier.N52a0131691(i);
        }
        return p;
    }
    static double N6f80622c77(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= 0.775352) {
            p = WekaClassifier.N3befe19478(i);
        } else if (i[4] > 0.775352) {
            p = WekaClassifier.N2a16562b84(i);
        }
        return p;
    }
    static double N3befe19478(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 0;
        } else if (i[2] <= 0.382163) {
            p = WekaClassifier.N1ae3b15379(i);
        } else if (i[2] > 0.382163) {
            p = 0;
        }
        return p;
    }
    static double N1ae3b15379(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 0;
        } else if (i[11] <= 0.132988) {
            p = WekaClassifier.N2550a04d80(i);
        } else if (i[11] > 0.132988) {
            p = WekaClassifier.Nae4ddf283(i);
        }
        return p;
    }
    static double N2550a04d80(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 3.138645) {
            p = WekaClassifier.N49ad37c981(i);
        } else if (i[1] > 3.138645) {
            p = 1;
        }
        return p;
    }
    static double N49ad37c981(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 0;
        } else if (i[11] <= -0.125639) {
            p = 0;
        } else if (i[11] > -0.125639) {
            p = WekaClassifier.Nd0a9c2982(i);
        }
        return p;
    }
    static double Nd0a9c2982(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 2.695189) {
            p = 3;
        } else if (i[1] > 2.695189) {
            p = 0;
        }
        return p;
    }
    static double Nae4ddf283(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= 0.214471) {
            p = 0;
        } else if (i[3] > 0.214471) {
            p = 2;
        }
        return p;
    }
    static double N2a16562b84(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= 0.140464) {
            p = WekaClassifier.Na253fdf85(i);
        } else if (i[5] > 0.140464) {
            p = WekaClassifier.N670ffb6888(i);
        }
        return p;
    }
    static double Na253fdf85(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 4.563551) {
            p = WekaClassifier.N5397016686(i);
        } else if (i[1] > 4.563551) {
            p = 3;
        }
        return p;
    }
    static double N5397016686(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 0;
        } else if (i[0] <= 69.901425) {
            p = 0;
        } else if (i[0] > 69.901425) {
            p = WekaClassifier.N7f304dab87(i);
        }
        return p;
    }
    static double N7f304dab87(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -0.349257) {
            p = 3;
        } else if (i[6] > -0.349257) {
            p = 2;
        }
        return p;
    }
    static double N670ffb6888(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= -1.52365) {
            p = 0;
        } else if (i[3] > -1.52365) {
            p = WekaClassifier.N44f7eb9189(i);
        }
        return p;
    }
    static double N44f7eb9189(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 0;
        } else if (i[0] <= 76.176279) {
            p = WekaClassifier.N2f804e5890(i);
        } else if (i[0] > 76.176279) {
            p = 3;
        }
        return p;
    }
    static double N2f804e5890(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 0;
        } else if (i[10] <= 0.679555) {
            p = 0;
        } else if (i[10] > 0.679555) {
            p = 3;
        }
        return p;
    }
    static double N52a0131691(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 2;
        } else if (i[2] <= 1.637343) {
            p = 2;
        } else if (i[2] > 1.637343) {
            p = 0;
        }
        return p;
    }
    static double N4a6c669192(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= 0.283166) {
            p = WekaClassifier.N313cb72e93(i);
        } else if (i[6] > 0.283166) {
            p = 2;
        }
        return p;
    }
    static double N313cb72e93(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 64.098249) {
            p = 1;
        } else if (i[0] > 64.098249) {
            p = WekaClassifier.N1c63cddf94(i);
        }
        return p;
    }
    static double N1c63cddf94(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= 0.567466) {
            p = 0;
        } else if (i[4] > 0.567466) {
            p = 3;
        }
        return p;
    }
    static double N4e8945e695(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -0.600861) {
            p = WekaClassifier.N6778fa4896(i);
        } else if (i[8] > -0.600861) {
            p = WekaClassifier.N1ec6571a104(i);
        }
        return p;
    }
    static double N6778fa4896(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= 0.546027) {
            p = WekaClassifier.N3329a44e97(i);
        } else if (i[10] > 0.546027) {
            p = 2;
        }
        return p;
    }
    static double N3329a44e97(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -0.19824) {
            p = WekaClassifier.N31a69ac198(i);
        } else if (i[3] > -0.19824) {
            p = WekaClassifier.N6bfb941f101(i);
        }
        return p;
    }
    static double N31a69ac198(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -0.508545) {
            p = 1;
        } else if (i[4] > -0.508545) {
            p = WekaClassifier.N35045f6699(i);
        }
        return p;
    }
    static double N35045f6699(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 2;
        } else if (i[11] <= 0.570438) {
            p = WekaClassifier.N158e5934100(i);
        } else if (i[11] > 0.570438) {
            p = 0;
        }
        return p;
    }
    static double N158e5934100(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 2;
        } else if (i[2] <= 2.148523) {
            p = 2;
        } else if (i[2] > 2.148523) {
            p = 3;
        }
        return p;
    }
    static double N6bfb941f101(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 63.412426) {
            p = 3;
        } else if (i[0] > 63.412426) {
            p = WekaClassifier.N6e0e6b33102(i);
        }
        return p;
    }
    static double N6e0e6b33102(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= 1.040681) {
            p = WekaClassifier.N7966f6fb103(i);
        } else if (i[4] > 1.040681) {
            p = 3;
        }
        return p;
    }
    static double N7966f6fb103(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -0.639272) {
            p = 3;
        } else if (i[5] > -0.639272) {
            p = 1;
        }
        return p;
    }
    static double N1ec6571a104(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 1;
        } else if (i[12] <= -1.13606) {
            p = WekaClassifier.N29aa63b1105(i);
        } else if (i[12] > -1.13606) {
            p = WekaClassifier.N34e0c244106(i);
        }
        return p;
    }
    static double N29aa63b1105(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 1.414719) {
            p = 1;
        } else if (i[2] > 1.414719) {
            p = 3;
        }
        return p;
    }
    static double N34e0c244106(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 0;
        } else if (i[10] <= 1.364791) {
            p = WekaClassifier.N7aff3b0d107(i);
        } else if (i[10] > 1.364791) {
            p = WekaClassifier.N257f0c3a112(i);
        }
        return p;
    }
    static double N7aff3b0d107(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= 1.097785) {
            p = WekaClassifier.N56adddcf108(i);
        } else if (i[3] > 1.097785) {
            p = WekaClassifier.N1d84f9e0111(i);
        }
        return p;
    }
    static double N56adddcf108(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 2;
        } else if (i[2] <= -0.253962) {
            p = 2;
        } else if (i[2] > -0.253962) {
            p = WekaClassifier.N2c609b40109(i);
        }
        return p;
    }
    static double N2c609b40109(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 0;
        } else if (i[8] <= -0.367559) {
            p = WekaClassifier.N1ea09e6a110(i);
        } else if (i[8] > -0.367559) {
            p = 0;
        }
        return p;
    }
    static double N1ea09e6a110(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 2;
        } else if (i[1] <= 3.376061) {
            p = 2;
        } else if (i[1] > 3.376061) {
            p = 0;
        }
        return p;
    }
    static double N1d84f9e0111(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= 0.4868) {
            p = 3;
        } else if (i[10] > 0.4868) {
            p = 2;
        }
        return p;
    }
    static double N257f0c3a112(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 2;
        } else if (i[8] <= 1.504766) {
            p = 2;
        } else if (i[8] > 1.504766) {
            p = 1;
        }
        return p;
    }
    static double Nd6d294e113(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 2;
        } else if (i[10] <= 1.323963) {
            p = WekaClassifier.N17a4a547114(i);
        } else if (i[10] > 1.323963) {
            p = WekaClassifier.N5b1ce949131(i);
        }
        return p;
    }
    static double N17a4a547114(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= 0.120813) {
            p = WekaClassifier.N2d5515aa115(i);
        } else if (i[6] > 0.120813) {
            p = WekaClassifier.N56ca363b125(i);
        }
        return p;
    }
    static double N2d5515aa115(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 0;
        } else if (i[12] <= 1.216011) {
            p = WekaClassifier.N7096c2e6116(i);
        } else if (i[12] > 1.216011) {
            p = 3;
        }
        return p;
    }
    static double N7096c2e6116(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= 2.186192) {
            p = WekaClassifier.N1455b2e3117(i);
        } else if (i[3] > 2.186192) {
            p = 3;
        }
        return p;
    }
    static double N1455b2e3117(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= -1.016677) {
            p = WekaClassifier.N26e9b3b3118(i);
        } else if (i[7] > -1.016677) {
            p = WekaClassifier.N65537df7120(i);
        }
        return p;
    }
    static double N26e9b3b3118(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 4.297211) {
            p = WekaClassifier.N23141a81119(i);
        } else if (i[1] > 4.297211) {
            p = 2;
        }
        return p;
    }
    static double N23141a81119(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 78.218562) {
            p = 2;
        } else if (i[0] > 78.218562) {
            p = 3;
        }
        return p;
    }
    static double N65537df7120(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= -2.505166) {
            p = WekaClassifier.N5ca81914121(i);
        } else if (i[1] > -2.505166) {
            p = WekaClassifier.N34f4896c123(i);
        }
        return p;
    }
    static double N5ca81914121(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= 0.1364) {
            p = 3;
        } else if (i[5] > 0.1364) {
            p = WekaClassifier.N37374d19122(i);
        }
        return p;
    }
    static double N37374d19122(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -0.857246) {
            p = 2;
        } else if (i[3] > -0.857246) {
            p = 0;
        }
        return p;
    }
    static double N34f4896c123(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= 0.724116) {
            p = 0;
        } else if (i[9] > 0.724116) {
            p = WekaClassifier.N4ab6e6c0124(i);
        }
        return p;
    }
    static double N4ab6e6c0124(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -0.324805) {
            p = 2;
        } else if (i[3] > -0.324805) {
            p = 0;
        }
        return p;
    }
    static double N56ca363b125(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -0.378175) {
            p = WekaClassifier.N5b98e67e126(i);
        } else if (i[5] > -0.378175) {
            p = WekaClassifier.N364ad4c8128(i);
        }
        return p;
    }
    static double N5b98e67e126(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -0.679734) {
            p = 2;
        } else if (i[3] > -0.679734) {
            p = WekaClassifier.N4b37bb88127(i);
        }
        return p;
    }
    static double N4b37bb88127(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 2.579594) {
            p = 3;
        } else if (i[1] > 2.579594) {
            p = 2;
        }
        return p;
    }
    static double N364ad4c8128(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 2;
        } else if (i[4] <= 1.415398) {
            p = WekaClassifier.N313657d4129(i);
        } else if (i[4] > 1.415398) {
            p = 0;
        }
        return p;
    }
    static double N313657d4129(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 2;
        } else if (i[8] <= -0.502229) {
            p = WekaClassifier.N2d01fc9a130(i);
        } else if (i[8] > -0.502229) {
            p = 3;
        }
        return p;
    }
    static double N2d01fc9a130(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 76.044151) {
            p = 2;
        } else if (i[0] > 76.044151) {
            p = 3;
        }
        return p;
    }
    static double N5b1ce949131(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -0.009892) {
            p = 1;
        } else if (i[4] > -0.009892) {
            p = 2;
        }
        return p;
    }
    static double N3b108a76132(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 4.445785) {
            p = WekaClassifier.N389bf237133(i);
        } else if (i[2] > 4.445785) {
            p = WekaClassifier.N31088d79303(i);
        }
        return p;
    }
    static double N389bf237133(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 62.762997) {
            p = WekaClassifier.N1a5c3c92134(i);
        } else if (i[0] > 62.762997) {
            p = WekaClassifier.N5dd6329e157(i);
        }
        return p;
    }
    static double N1a5c3c92134(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 0.848121) {
            p = WekaClassifier.N2636c831135(i);
        } else if (i[2] > 0.848121) {
            p = WekaClassifier.N7e839c3f146(i);
        }
        return p;
    }
    static double N2636c831135(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= 0.706863) {
            p = WekaClassifier.N19cab5bb136(i);
        } else if (i[4] > 0.706863) {
            p = 3;
        }
        return p;
    }
    static double N19cab5bb136(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 1;
        } else if (i[9] <= 0.530865) {
            p = WekaClassifier.N7e27e6ff137(i);
        } else if (i[9] > 0.530865) {
            p = WekaClassifier.N3a578da5142(i);
        }
        return p;
    }
    static double N7e27e6ff137(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= -0.838227) {
            p = WekaClassifier.N564fd05138(i);
        } else if (i[2] > -0.838227) {
            p = WekaClassifier.N1583dad8139(i);
        }
        return p;
    }
    static double N564fd05138(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 58.681968) {
            p = 3;
        } else if (i[0] > 58.681968) {
            p = 1;
        }
        return p;
    }
    static double N1583dad8139(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 1;
        } else if (i[9] <= -0.224352) {
            p = WekaClassifier.N5928d2be140(i);
        } else if (i[9] > -0.224352) {
            p = 1;
        }
        return p;
    }
    static double N5928d2be140(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= 0.083458) {
            p = WekaClassifier.N1879c77a141(i);
        } else if (i[4] > 0.083458) {
            p = 2;
        }
        return p;
    }
    static double N1879c77a141(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 1;
        } else if (i[7] <= 0.589462) {
            p = 1;
        } else if (i[7] > 0.589462) {
            p = 2;
        }
        return p;
    }
    static double N3a578da5142(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 1;
        } else if (i[6] <= 0.050546) {
            p = 1;
        } else if (i[6] > 0.050546) {
            p = WekaClassifier.N3109c52d143(i);
        }
        return p;
    }
    static double N3109c52d143(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -0.074342) {
            p = 2;
        } else if (i[3] > -0.074342) {
            p = WekaClassifier.N2e2b5c90144(i);
        }
        return p;
    }
    static double N2e2b5c90144(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -0.328972) {
            p = 3;
        } else if (i[5] > -0.328972) {
            p = WekaClassifier.N783f1c38145(i);
        }
        return p;
    }
    static double N783f1c38145(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 0.514501) {
            p = 1;
        } else if (i[2] > 0.514501) {
            p = 2;
        }
        return p;
    }
    static double N7e839c3f146(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -0.419358) {
            p = WekaClassifier.N1dc1e6f147(i);
        } else if (i[5] > -0.419358) {
            p = WekaClassifier.N76f75252151(i);
        }
        return p;
    }
    static double N1dc1e6f147(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 3;
        } else if (i[11] <= -0.759248) {
            p = 3;
        } else if (i[11] > -0.759248) {
            p = WekaClassifier.N75e70d18148(i);
        }
        return p;
    }
    static double N75e70d18148(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 2;
        } else if (i[1] <= 7.331481) {
            p = WekaClassifier.N75391140149(i);
        } else if (i[1] > 7.331481) {
            p = 2;
        }
        return p;
    }
    static double N75391140149(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= 2.186192) {
            p = WekaClassifier.N173909bc150(i);
        } else if (i[3] > 2.186192) {
            p = 3;
        }
        return p;
    }
    static double N173909bc150(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 1;
        } else if (i[8] <= -1.490337) {
            p = 1;
        } else if (i[8] > -1.490337) {
            p = 2;
        }
        return p;
    }
    static double N76f75252151(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 2;
        } else if (i[12] <= 0.046839) {
            p = WekaClassifier.N3bb51e59152(i);
        } else if (i[12] > 0.046839) {
            p = WekaClassifier.N591026ec154(i);
        }
        return p;
    }
    static double N3bb51e59152(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -0.067814) {
            p = 2;
        } else if (i[3] > -0.067814) {
            p = WekaClassifier.N63bab7e153(i);
        }
        return p;
    }
    static double N63bab7e153(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -0.726665) {
            p = 1;
        } else if (i[4] > -0.726665) {
            p = 2;
        }
        return p;
    }
    static double N591026ec154(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= 0.529234) {
            p = WekaClassifier.N15b99a5e155(i);
        } else if (i[3] > 0.529234) {
            p = 1;
        }
        return p;
    }
    static double N15b99a5e155(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 2;
        } else if (i[11] <= 0.999025) {
            p = WekaClassifier.N6ed0966156(i);
        } else if (i[11] > 0.999025) {
            p = 0;
        }
        return p;
    }
    static double N6ed0966156(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 1.458551) {
            p = 1;
        } else if (i[2] > 1.458551) {
            p = 2;
        }
        return p;
    }
    static double N5dd6329e157(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 71.491756) {
            p = WekaClassifier.N5a9588e158(i);
        } else if (i[0] > 71.491756) {
            p = WekaClassifier.Na4fc1e2189(i);
        }
        return p;
    }
    static double N5a9588e158(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 2.16098) {
            p = WekaClassifier.N5c1b590f159(i);
        } else if (i[2] > 2.16098) {
            p = WekaClassifier.N736fc9c3176(i);
        }
        return p;
    }
    static double N5c1b590f159(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= 1.693514) {
            p = WekaClassifier.N32d3ddd3160(i);
        } else if (i[4] > 1.693514) {
            p = 2;
        }
        return p;
    }
    static double N32d3ddd3160(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 1;
        } else if (i[3] <= -0.70953) {
            p = WekaClassifier.N5e7d4bd5161(i);
        } else if (i[3] > -0.70953) {
            p = WekaClassifier.N6697ce23166(i);
        }
        return p;
    }
    static double N5e7d4bd5161(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 1.268431) {
            p = WekaClassifier.N115f05bc162(i);
        } else if (i[2] > 1.268431) {
            p = 2;
        }
        return p;
    }
    static double N115f05bc162(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 1;
        } else if (i[1] <= 8.731985) {
            p = WekaClassifier.N178af5b9163(i);
        } else if (i[1] > 8.731985) {
            p = 2;
        }
        return p;
    }
    static double N178af5b9163(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 1;
        } else if (i[9] <= 1.026917) {
            p = WekaClassifier.N3b9b8fde164(i);
        } else if (i[9] > 1.026917) {
            p = 0;
        }
        return p;
    }
    static double N3b9b8fde164(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 3;
        } else if (i[2] <= -1.908267) {
            p = WekaClassifier.Nf0c489b165(i);
        } else if (i[2] > -1.908267) {
            p = 1;
        }
        return p;
    }
    static double Nf0c489b165(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 3;
        } else if (i[4] <= 0.831687) {
            p = 3;
        } else if (i[4] > 0.831687) {
            p = 0;
        }
        return p;
    }
    static double N6697ce23166(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -1.180461) {
            p = WekaClassifier.N26f0d875167(i);
        } else if (i[5] > -1.180461) {
            p = WekaClassifier.N2c57863f169(i);
        }
        return p;
    }
    static double N26f0d875167(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 65.772128) {
            p = 3;
        } else if (i[0] > 65.772128) {
            p = WekaClassifier.N41f2460a168(i);
        }
        return p;
    }
    static double N41f2460a168(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 1;
        } else if (i[7] <= 1.328106) {
            p = 1;
        } else if (i[7] > 1.328106) {
            p = 3;
        }
        return p;
    }
    static double N2c57863f169(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 1;
        } else if (i[6] <= -0.556492) {
            p = WekaClassifier.N7469b340170(i);
        } else if (i[6] > -0.556492) {
            p = WekaClassifier.N2ed77ae7174(i);
        }
        return p;
    }
    static double N7469b340170(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= 0.528235) {
            p = WekaClassifier.N54faeec8171(i);
        } else if (i[4] > 0.528235) {
            p = WekaClassifier.N179d28e7173(i);
        }
        return p;
    }
    static double N54faeec8171(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 2;
        } else if (i[1] <= 6.126508) {
            p = 2;
        } else if (i[1] > 6.126508) {
            p = WekaClassifier.N76b304b172(i);
        }
        return p;
    }
    static double N76b304b172(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 1;
        } else if (i[10] <= 0.382971) {
            p = 1;
        } else if (i[10] > 0.382971) {
            p = 2;
        }
        return p;
    }
    static double N179d28e7173(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= 0.023702) {
            p = 3;
        } else if (i[5] > 0.023702) {
            p = 1;
        }
        return p;
    }
    static double N2ed77ae7174(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 1;
        } else if (i[1] <= 8.209274) {
            p = 1;
        } else if (i[1] > 8.209274) {
            p = WekaClassifier.N2dd85d5b175(i);
        }
        return p;
    }
    static double N2dd85d5b175(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 64.507795) {
            p = 3;
        } else if (i[0] > 64.507795) {
            p = 1;
        }
        return p;
    }
    static double N736fc9c3176(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 2;
        } else if (i[8] <= -1.448279) {
            p = WekaClassifier.Ndcb1d59177(i);
        } else if (i[8] > -1.448279) {
            p = WekaClassifier.N185e4e45178(i);
        }
        return p;
    }
    static double Ndcb1d59177(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 69.145791) {
            p = 2;
        } else if (i[0] > 69.145791) {
            p = 1;
        }
        return p;
    }
    static double N185e4e45178(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 3;
        } else if (i[7] <= -0.806597) {
            p = WekaClassifier.N7703fa90179(i);
        } else if (i[7] > -0.806597) {
            p = WekaClassifier.N7aaf0462180(i);
        }
        return p;
    }
    static double N7703fa90179(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 9.096334) {
            p = 0;
        } else if (i[1] > 9.096334) {
            p = 3;
        }
        return p;
    }
    static double N7aaf0462180(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 7.745414) {
            p = WekaClassifier.N2f5befbb181(i);
        } else if (i[1] > 7.745414) {
            p = WekaClassifier.N774c3125186(i);
        }
        return p;
    }
    static double N2f5befbb181(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= 1.929864) {
            p = WekaClassifier.N459da073182(i);
        } else if (i[3] > 1.929864) {
            p = WekaClassifier.N5ffa8c91185(i);
        }
        return p;
    }
    static double N459da073182(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 0;
        } else if (i[8] <= 0.493996) {
            p = WekaClassifier.N2d22152a183(i);
        } else if (i[8] > 0.493996) {
            p = WekaClassifier.N2f2c98f8184(i);
        }
        return p;
    }
    static double N2d22152a183(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 0;
        } else if (i[12] <= 0.528179) {
            p = 0;
        } else if (i[12] > 0.528179) {
            p = 1;
        }
        return p;
    }
    static double N2f2c98f8184(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 1;
        } else if (i[6] <= -0.189315) {
            p = 1;
        } else if (i[6] > -0.189315) {
            p = 2;
        }
        return p;
    }
    static double N5ffa8c91185(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 68.386991) {
            p = 1;
        } else if (i[0] > 68.386991) {
            p = 3;
        }
        return p;
    }
    static double N774c3125186(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= 0.202991) {
            p = WekaClassifier.N4a7ae1a3187(i);
        } else if (i[3] > 0.202991) {
            p = 1;
        }
        return p;
    }
    static double N4a7ae1a3187(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= -0.871699) {
            p = WekaClassifier.N1da5b4c188(i);
        } else if (i[6] > -0.871699) {
            p = 2;
        }
        return p;
    }
    static double N1da5b4c188(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 0;
        } else if (i[5] <= -1.128494) {
            p = 0;
        } else if (i[5] > -1.128494) {
            p = 1;
        }
        return p;
    }
    static double Na4fc1e2189(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= 1.134824) {
            p = WekaClassifier.N1c1c1c97190(i);
        } else if (i[3] > 1.134824) {
            p = WekaClassifier.N4b7de655297(i);
        }
        return p;
    }
    static double N1c1c1c97190(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 95.333404) {
            p = WekaClassifier.N1f6814e191(i);
        } else if (i[0] > 95.333404) {
            p = WekaClassifier.N47b2d498287(i);
        }
        return p;
    }
    static double N1f6814e191(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 2;
        } else if (i[4] <= 0.209557) {
            p = WekaClassifier.N5225ba07192(i);
        } else if (i[4] > 0.209557) {
            p = WekaClassifier.N13514d21276(i);
        }
        return p;
    }
    static double N5225ba07192(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -0.659884) {
            p = WekaClassifier.N26113170193(i);
        } else if (i[6] > -0.659884) {
            p = WekaClassifier.N2fa983da247(i);
        }
        return p;
    }
    static double N26113170193(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 10.249006) {
            p = WekaClassifier.N5a957981194(i);
        } else if (i[1] > 10.249006) {
            p = WekaClassifier.N79994960231(i);
        }
        return p;
    }
    static double N5a957981194(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= 0.005986) {
            p = WekaClassifier.N6fdc6f6c195(i);
        } else if (i[10] > 0.005986) {
            p = WekaClassifier.N3319bd91214(i);
        }
        return p;
    }
    static double N6fdc6f6c195(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 6.805984) {
            p = WekaClassifier.N10d61512196(i);
        } else if (i[1] > 6.805984) {
            p = WekaClassifier.N3f632cc9197(i);
        }
        return p;
    }
    static double N10d61512196(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 6.15305) {
            p = 3;
        } else if (i[1] > 6.15305) {
            p = 0;
        }
        return p;
    }
    static double N3f632cc9197(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 2;
        } else if (i[9] <= -0.810946) {
            p = WekaClassifier.N4e4b13d5198(i);
        } else if (i[9] > -0.810946) {
            p = WekaClassifier.N52de4ab3202(i);
        }
        return p;
    }
    static double N4e4b13d5198(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -1.079952) {
            p = WekaClassifier.N4260a27f199(i);
        } else if (i[8] > -1.079952) {
            p = WekaClassifier.N623e51a4200(i);
        }
        return p;
    }
    static double N4260a27f199(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 9.409775) {
            p = 3;
        } else if (i[1] > 9.409775) {
            p = 2;
        }
        return p;
    }
    static double N623e51a4200(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 0;
        } else if (i[8] <= -0.790131) {
            p = 0;
        } else if (i[8] > -0.790131) {
            p = WekaClassifier.N449d3c4e201(i);
        }
        return p;
    }
    static double N449d3c4e201(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -2.316154) {
            p = 1;
        } else if (i[4] > -2.316154) {
            p = 2;
        }
        return p;
    }
    static double N52de4ab3202(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= -0.046906) {
            p = WekaClassifier.N15ea69cd203(i);
        } else if (i[2] > -0.046906) {
            p = WekaClassifier.N5c9a9a5204(i);
        }
        return p;
    }
    static double N15ea69cd203(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 8.230942) {
            p = 3;
        } else if (i[1] > 8.230942) {
            p = 1;
        }
        return p;
    }
    static double N5c9a9a5204(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 3;
        } else if (i[9] <= 0.724116) {
            p = WekaClassifier.N289b8a1e205(i);
        } else if (i[9] > 0.724116) {
            p = WekaClassifier.N280d4b0d213(i);
        }
        return p;
    }
    static double N289b8a1e205(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -1.827449) {
            p = WekaClassifier.N8b0c66c206(i);
        } else if (i[5] > -1.827449) {
            p = WekaClassifier.N61e6e58208(i);
        }
        return p;
    }
    static double N8b0c66c206(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 9.347284) {
            p = 3;
        } else if (i[1] > 9.347284) {
            p = WekaClassifier.N4e5262b6207(i);
        }
        return p;
    }
    static double N4e5262b6207(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 2;
        } else if (i[9] <= -0.428419) {
            p = 2;
        } else if (i[9] > -0.428419) {
            p = 3;
        }
        return p;
    }
    static double N61e6e58208(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -1.715396) {
            p = 2;
        } else if (i[5] > -1.715396) {
            p = WekaClassifier.N72a1cfff209(i);
        }
        return p;
    }
    static double N72a1cfff209(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= 0.017249) {
            p = WekaClassifier.N7cacf461210(i);
        } else if (i[8] > 0.017249) {
            p = WekaClassifier.N542fb840212(i);
        }
        return p;
    }
    static double N7cacf461210(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 3;
        } else if (i[2] <= 2.746029) {
            p = 3;
        } else if (i[2] > 2.746029) {
            p = WekaClassifier.N21366e90211(i);
        }
        return p;
    }
    static double N21366e90211(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= -1.066705) {
            p = 0;
        } else if (i[4] > -1.066705) {
            p = 3;
        }
        return p;
    }
    static double N542fb840212(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= -1.17114) {
            p = 0;
        } else if (i[6] > -1.17114) {
            p = 1;
        }
        return p;
    }
    static double N280d4b0d213(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 8.376548) {
            p = 0;
        } else if (i[1] > 8.376548) {
            p = 2;
        }
        return p;
    }
    static double N3319bd91214(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 3;
        } else if (i[7] <= 2.049123) {
            p = WekaClassifier.N2149178c215(i);
        } else if (i[7] > 2.049123) {
            p = WekaClassifier.N41897ca7229(i);
        }
        return p;
    }
    static double N2149178c215(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 8.626497) {
            p = WekaClassifier.N80d465d216(i);
        } else if (i[1] > 8.626497) {
            p = WekaClassifier.N1f34c0c9222(i);
        }
        return p;
    }
    static double N80d465d216(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -0.313002) {
            p = WekaClassifier.N4a1a2172217(i);
        } else if (i[8] > -0.313002) {
            p = WekaClassifier.N3f50e6ae220(i);
        }
        return p;
    }
    static double N4a1a2172217(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 1;
        } else if (i[9] <= 0.654604) {
            p = WekaClassifier.N3411f895218(i);
        } else if (i[9] > 0.654604) {
            p = 3;
        }
        return p;
    }
    static double N3411f895218(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -2.104266) {
            p = 1;
        } else if (i[4] > -2.104266) {
            p = WekaClassifier.N5d8d7cec219(i);
        }
        return p;
    }
    static double N5d8d7cec219(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -1.268551) {
            p = 3;
        } else if (i[6] > -1.268551) {
            p = 1;
        }
        return p;
    }
    static double N3f50e6ae220(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 82.4308) {
            p = 3;
        } else if (i[0] > 82.4308) {
            p = WekaClassifier.N245a5187221(i);
        }
        return p;
    }
    static double N245a5187221(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= -2.452662) {
            p = 0;
        } else if (i[4] > -2.452662) {
            p = 2;
        }
        return p;
    }
    static double N1f34c0c9222(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -1.972871) {
            p = WekaClassifier.N2968b5df223(i);
        } else if (i[5] > -1.972871) {
            p = WekaClassifier.N5e1e48b1226(i);
        }
        return p;
    }
    static double N2968b5df223(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 0;
        } else if (i[0] <= 91.546134) {
            p = WekaClassifier.N113543ca224(i);
        } else if (i[0] > 91.546134) {
            p = WekaClassifier.N6795fe02225(i);
        }
        return p;
    }
    static double N113543ca224(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 3;
        } else if (i[11] <= -0.83156) {
            p = 3;
        } else if (i[11] > -0.83156) {
            p = 0;
        }
        return p;
    }
    static double N6795fe02225(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -1.32827) {
            p = 1;
        } else if (i[4] > -1.32827) {
            p = 3;
        }
        return p;
    }
    static double N5e1e48b1226(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 9.062283) {
            p = 0;
        } else if (i[1] > 9.062283) {
            p = WekaClassifier.N32b4d8e0227(i);
        }
        return p;
    }
    static double N32b4d8e0227(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 1;
        } else if (i[1] <= 9.569049) {
            p = 1;
        } else if (i[1] > 9.569049) {
            p = WekaClassifier.N924f66f228(i);
        }
        return p;
    }
    static double N924f66f228(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 0;
        } else if (i[2] <= 4.061808) {
            p = 0;
        } else if (i[2] > 4.061808) {
            p = 1;
        }
        return p;
    }
    static double N41897ca7229(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -2.824677) {
            p = WekaClassifier.N6dfeffe7230(i);
        } else if (i[3] > -2.824677) {
            p = 1;
        }
        return p;
    }
    static double N6dfeffe7230(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -0.76917) {
            p = 2;
        } else if (i[5] > -0.76917) {
            p = 0;
        }
        return p;
    }
    static double N79994960231(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= -1.041067) {
            p = WekaClassifier.N57204fb2232(i);
        } else if (i[9] > -1.041067) {
            p = WekaClassifier.N5dc67db5233(i);
        }
        return p;
    }
    static double N57204fb2232(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -1.42206) {
            p = 3;
        } else if (i[5] > -1.42206) {
            p = 0;
        }
        return p;
    }
    static double N5dc67db5233(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 85.889277) {
            p = WekaClassifier.N47ddb02d234(i);
        } else if (i[0] > 85.889277) {
            p = WekaClassifier.N13d7ac7a243(i);
        }
        return p;
    }
    static double N47ddb02d234(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 1;
        } else if (i[7] <= 0.684238) {
            p = WekaClassifier.N743c23ff235(i);
        } else if (i[7] > 0.684238) {
            p = WekaClassifier.N7479f9c8240(i);
        }
        return p;
    }
    static double N743c23ff235(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 77.214655) {
            p = 2;
        } else if (i[0] > 77.214655) {
            p = WekaClassifier.N21b4af15236(i);
        }
        return p;
    }
    static double N21b4af15236(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 1;
        } else if (i[9] <= 0.926401) {
            p = WekaClassifier.N4ff14543237(i);
        } else if (i[9] > 0.926401) {
            p = 1;
        }
        return p;
    }
    static double N4ff14543237(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 1;
        } else if (i[10] <= -0.239884) {
            p = WekaClassifier.N6507d848238(i);
        } else if (i[10] > -0.239884) {
            p = WekaClassifier.N70b12ccc239(i);
        }
        return p;
    }
    static double N6507d848238(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -0.695258) {
            p = 1;
        } else if (i[4] > -0.695258) {
            p = 2;
        }
        return p;
    }
    static double N70b12ccc239(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 2;
        } else if (i[4] <= -0.677398) {
            p = 2;
        } else if (i[4] > -0.677398) {
            p = 0;
        }
        return p;
    }
    static double N7479f9c8240(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 2;
        } else if (i[4] <= 0.019944) {
            p = WekaClassifier.N31e76159241(i);
        } else if (i[4] > 0.019944) {
            p = 0;
        }
        return p;
    }
    static double N31e76159241(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 2;
        } else if (i[9] <= -0.213979) {
            p = 2;
        } else if (i[9] > -0.213979) {
            p = WekaClassifier.N6a792ab5242(i);
        }
        return p;
    }
    static double N6a792ab5242(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 2;
        } else if (i[1] <= 12.050229) {
            p = 2;
        } else if (i[1] > 12.050229) {
            p = 0;
        }
        return p;
    }
    static double N13d7ac7a243(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -5.172073) {
            p = 2;
        } else if (i[3] > -5.172073) {
            p = WekaClassifier.N285bb071244(i);
        }
        return p;
    }
    static double N285bb071244(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 1;
        } else if (i[8] <= 0.085776) {
            p = WekaClassifier.N223ce18a245(i);
        } else if (i[8] > 0.085776) {
            p = 1;
        }
        return p;
    }
    static double N223ce18a245(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= -0.198219) {
            p = 3;
        } else if (i[10] > -0.198219) {
            p = WekaClassifier.N1334bfa246(i);
        }
        return p;
    }
    static double N1334bfa246(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -3.255211) {
            p = 2;
        } else if (i[3] > -3.255211) {
            p = 1;
        }
        return p;
    }
    static double N2fa983da247(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 2;
        } else if (i[12] <= 0.744486) {
            p = WekaClassifier.N5a046666248(i);
        } else if (i[12] > 0.744486) {
            p = WekaClassifier.N63807539275(i);
        }
        return p;
    }
    static double N5a046666248(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= -4.201745) {
            p = WekaClassifier.N1ff1ec1d249(i);
        } else if (i[3] > -4.201745) {
            p = WekaClassifier.Ne1d178b253(i);
        }
        return p;
    }
    static double N1ff1ec1d249(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= -0.150903) {
            p = WekaClassifier.N4060882250(i);
        } else if (i[4] > -0.150903) {
            p = 2;
        }
        return p;
    }
    static double N4060882250(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 3;
        } else if (i[7] <= 0.500174) {
            p = WekaClassifier.N67d2ec8b251(i);
        } else if (i[7] > 0.500174) {
            p = WekaClassifier.N1e9c8141252(i);
        }
        return p;
    }
    static double N67d2ec8b251(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= -4.994281) {
            p = 0;
        } else if (i[3] > -4.994281) {
            p = 3;
        }
        return p;
    }
    static double N1e9c8141252(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 0;
        } else if (i[0] <= 91.153307) {
            p = 0;
        } else if (i[0] > 91.153307) {
            p = 2;
        }
        return p;
    }
    static double Ne1d178b253(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 2;
        } else if (i[4] <= -2.833582) {
            p = WekaClassifier.N3a6b4cd2254(i);
        } else if (i[4] > -2.833582) {
            p = WekaClassifier.N30414f2d256(i);
        }
        return p;
    }
    static double N3a6b4cd2254(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 2;
        } else if (i[10] <= 0.355772) {
            p = WekaClassifier.N4a2d49a0255(i);
        } else if (i[10] > 0.355772) {
            p = 1;
        }
        return p;
    }
    static double N4a2d49a0255(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 77.410381) {
            p = 1;
        } else if (i[0] > 77.410381) {
            p = 2;
        }
        return p;
    }
    static double N30414f2d256(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 2;
        } else if (i[2] <= 2.921858) {
            p = WekaClassifier.N5606a7e1257(i);
        } else if (i[2] > 2.921858) {
            p = WekaClassifier.N2e3f6a32271(i);
        }
        return p;
    }
    static double N5606a7e1257(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 2;
        } else if (i[10] <= -0.045231) {
            p = WekaClassifier.N366b6c2f258(i);
        } else if (i[10] > -0.045231) {
            p = WekaClassifier.N852da6f264(i);
        }
        return p;
    }
    static double N366b6c2f258(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 74.699333) {
            p = WekaClassifier.N16ab530b259(i);
        } else if (i[0] > 74.699333) {
            p = WekaClassifier.N2ca94ed4260(i);
        }
        return p;
    }
    static double N16ab530b259(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= -1.388941) {
            p = 0;
        } else if (i[3] > -1.388941) {
            p = 1;
        }
        return p;
    }
    static double N2ca94ed4260(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 0;
        } else if (i[12] <= -0.822613) {
            p = WekaClassifier.N4f73dd0f261(i);
        } else if (i[12] > -0.822613) {
            p = WekaClassifier.N6eebe688263(i);
        }
        return p;
    }
    static double N4f73dd0f261(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= -2.229875) {
            p = 0;
        } else if (i[3] > -2.229875) {
            p = WekaClassifier.N2294dada262(i);
        }
        return p;
    }
    static double N2294dada262(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 92.341209) {
            p = 2;
        } else if (i[0] > 92.341209) {
            p = 0;
        }
        return p;
    }
    static double N6eebe688263(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 2;
        } else if (i[12] <= 0.312675) {
            p = 2;
        } else if (i[12] > 0.312675) {
            p = 3;
        }
        return p;
    }
    static double N852da6f264(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 1;
        } else if (i[6] <= 0.76161) {
            p = WekaClassifier.N5998e5cf265(i);
        } else if (i[6] > 0.76161) {
            p = WekaClassifier.N44c06b8f270(i);
        }
        return p;
    }
    static double N5998e5cf265(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 1.491814) {
            p = WekaClassifier.N5d5ea62c266(i);
        } else if (i[2] > 1.491814) {
            p = WekaClassifier.N72affaf2268(i);
        }
        return p;
    }
    static double N5d5ea62c266(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 1.149784) {
            p = WekaClassifier.N6cb0c4a9267(i);
        } else if (i[2] > 1.149784) {
            p = 2;
        }
        return p;
    }
    static double N6cb0c4a9267(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 1;
        } else if (i[8] <= 0.619567) {
            p = 1;
        } else if (i[8] > 0.619567) {
            p = 0;
        }
        return p;
    }
    static double N72affaf2268(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 10.148492) {
            p = WekaClassifier.N6c87dff5269(i);
        } else if (i[1] > 10.148492) {
            p = 1;
        }
        return p;
    }
    static double N6c87dff5269(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 1;
        } else if (i[1] <= 8.057015) {
            p = 1;
        } else if (i[1] > 8.057015) {
            p = 0;
        }
        return p;
    }
    static double N44c06b8f270(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 2;
        } else if (i[11] <= 0.423428) {
            p = 2;
        } else if (i[11] > 0.423428) {
            p = 1;
        }
        return p;
    }
    static double N2e3f6a32271(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 8.578047) {
            p = 3;
        } else if (i[1] > 8.578047) {
            p = WekaClassifier.N234a6d6d272(i);
        }
        return p;
    }
    static double N234a6d6d272(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 2;
        } else if (i[4] <= -1.59278) {
            p = 2;
        } else if (i[4] > -1.59278) {
            p = WekaClassifier.N71e07686273(i);
        }
        return p;
    }
    static double N71e07686273(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 0;
        } else if (i[10] <= -0.404409) {
            p = WekaClassifier.N36bbf726274(i);
        } else if (i[10] > -0.404409) {
            p = 0;
        }
        return p;
    }
    static double N36bbf726274(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 0;
        } else if (i[0] <= 77.973329) {
            p = 0;
        } else if (i[0] > 77.973329) {
            p = 2;
        }
        return p;
    }
    static double N63807539275(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 1;
        } else if (i[6] <= 0.196488) {
            p = 1;
        } else if (i[6] > 0.196488) {
            p = 2;
        }
        return p;
    }
    static double N13514d21276(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 9.248952) {
            p = WekaClassifier.N61775d8b277(i);
        } else if (i[1] > 9.248952) {
            p = WekaClassifier.N4666eeab282(i);
        }
        return p;
    }
    static double N61775d8b277(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -0.688867) {
            p = WekaClassifier.N81c9444278(i);
        } else if (i[6] > -0.688867) {
            p = WekaClassifier.N717461bd280(i);
        }
        return p;
    }
    static double N81c9444278(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -0.898741) {
            p = 3;
        } else if (i[8] > -0.898741) {
            p = WekaClassifier.N68d501c3279(i);
        }
        return p;
    }
    static double N68d501c3279(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= -0.627848) {
            p = 3;
        } else if (i[10] > -0.627848) {
            p = 0;
        }
        return p;
    }
    static double N717461bd280(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 73.26014) {
            p = 3;
        } else if (i[0] > 73.26014) {
            p = WekaClassifier.N2a34f11d281(i);
        }
        return p;
    }
    static double N2a34f11d281(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -0.275172) {
            p = 2;
        } else if (i[5] > -0.275172) {
            p = 0;
        }
        return p;
    }
    static double N4666eeab282(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= 1.407253) {
            p = WekaClassifier.N6fd24bd283(i);
        } else if (i[5] > 1.407253) {
            p = WekaClassifier.N2885d5f9286(i);
        }
        return p;
    }
    static double N6fd24bd283(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -2.609099) {
            p = 2;
        } else if (i[3] > -2.609099) {
            p = WekaClassifier.N5456d456284(i);
        }
        return p;
    }
    static double N5456d456284(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 0;
        } else if (i[12] <= -0.133223) {
            p = WekaClassifier.N59e76bd8285(i);
        } else if (i[12] > -0.133223) {
            p = 2;
        }
        return p;
    }
    static double N59e76bd8285(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 3;
        } else if (i[2] <= 2.742241) {
            p = 3;
        } else if (i[2] > 2.742241) {
            p = 0;
        }
        return p;
    }
    static double N2885d5f9286(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 3;
        } else if (i[2] <= 1.811881) {
            p = 3;
        } else if (i[2] > 1.811881) {
            p = 0;
        }
        return p;
    }
    static double N47b2d498287(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= -4.196901) {
            p = WekaClassifier.N25244c5c288(i);
        } else if (i[3] > -4.196901) {
            p = WekaClassifier.N10147f36291(i);
        }
        return p;
    }
    static double N25244c5c288(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 8.643591) {
            p = WekaClassifier.N477f5a8b289(i);
        } else if (i[1] > 8.643591) {
            p = 1;
        }
        return p;
    }
    static double N477f5a8b289(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= -1.007576) {
            p = WekaClassifier.N41d37580290(i);
        } else if (i[9] > -1.007576) {
            p = 0;
        }
        return p;
    }
    static double N41d37580290(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 7.440581) {
            p = 0;
        } else if (i[1] > 7.440581) {
            p = 1;
        }
        return p;
    }
    static double N10147f36291(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 2;
        } else if (i[1] <= 6.039807) {
            p = 2;
        } else if (i[1] > 6.039807) {
            p = WekaClassifier.N175587c4292(i);
        }
        return p;
    }
    static double N175587c4292(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 1;
        } else if (i[7] <= 2.409304) {
            p = WekaClassifier.N2ac33ca7293(i);
        } else if (i[7] > 2.409304) {
            p = 3;
        }
        return p;
    }
    static double N2ac33ca7293(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -1.410726) {
            p = WekaClassifier.N7066230a294(i);
        } else if (i[4] > -1.410726) {
            p = WekaClassifier.N78e8cbeb296(i);
        }
        return p;
    }
    static double N7066230a294(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 101.423687) {
            p = 1;
        } else if (i[0] > 101.423687) {
            p = WekaClassifier.N43b80fff295(i);
        }
        return p;
    }
    static double N43b80fff295(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 1;
        } else if (i[5] <= -0.70416) {
            p = 1;
        } else if (i[5] > -0.70416) {
            p = 0;
        }
        return p;
    }
    static double N78e8cbeb296(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 97.235383) {
            p = 3;
        } else if (i[0] > 97.235383) {
            p = 1;
        }
        return p;
    }
    static double N4b7de655297(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= 0.040571) {
            p = WekaClassifier.Na42f243298(i);
        } else if (i[4] > 0.040571) {
            p = WekaClassifier.N906d303299(i);
        }
        return p;
    }
    static double Na42f243298(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -3.175638) {
            p = 3;
        } else if (i[6] > -3.175638) {
            p = 1;
        }
        return p;
    }
    static double N906d303299(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 9.054804) {
            p = WekaClassifier.N378ff65b300(i);
        } else if (i[1] > 9.054804) {
            p = WekaClassifier.Nea9c964302(i);
        }
        return p;
    }
    static double N378ff65b300(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 81.49962) {
            p = WekaClassifier.N13e4f1b1301(i);
        } else if (i[0] > 81.49962) {
            p = 2;
        }
        return p;
    }
    static double N13e4f1b1301(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 2.767497) {
            p = 1;
        } else if (i[2] > 2.767497) {
            p = 3;
        }
        return p;
    }
    static double Nea9c964302(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= 2.304988) {
            p = 2;
        } else if (i[3] > 2.304988) {
            p = 1;
        }
        return p;
    }
    static double N31088d79303(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= 1.971088) {
            p = WekaClassifier.N797d882d304(i);
        } else if (i[3] > 1.971088) {
            p = WekaClassifier.N14ce0c13325(i);
        }
        return p;
    }
    static double N797d882d304(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -1.8711) {
            p = WekaClassifier.N4d2087ca305(i);
        } else if (i[6] > -1.8711) {
            p = WekaClassifier.N6084cb67311(i);
        }
        return p;
    }
    static double N4d2087ca305(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= 0.099625) {
            p = WekaClassifier.Nd0295e3306(i);
        } else if (i[3] > 0.099625) {
            p = WekaClassifier.N3dde81e9310(i);
        }
        return p;
    }
    static double Nd0295e3306(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 3;
        } else if (i[2] <= 4.626894) {
            p = 3;
        } else if (i[2] > 4.626894) {
            p = WekaClassifier.N7894b27f307(i);
        }
        return p;
    }
    static double N7894b27f307(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 0;
        } else if (i[10] <= 0.022028) {
            p = WekaClassifier.N6dbd71a0308(i);
        } else if (i[10] > 0.022028) {
            p = WekaClassifier.N246aa50a309(i);
        }
        return p;
    }
    static double N6dbd71a0308(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= -1.76798) {
            p = 2;
        } else if (i[7] > -1.76798) {
            p = 0;
        }
        return p;
    }
    static double N246aa50a309(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= -2.945967) {
            p = 0;
        } else if (i[6] > -2.945967) {
            p = 3;
        }
        return p;
    }
    static double N3dde81e9310(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= 0.584394) {
            p = 3;
        } else if (i[10] > 0.584394) {
            p = 0;
        }
        return p;
    }
    static double N6084cb67311(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= -1.485609) {
            p = WekaClassifier.N66b286a6312(i);
        } else if (i[7] > -1.485609) {
            p = WekaClassifier.N5e99275f314(i);
        }
        return p;
    }
    static double N66b286a6312(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= -1.942424) {
            p = 2;
        } else if (i[7] > -1.942424) {
            p = WekaClassifier.N17813d8f313(i);
        }
        return p;
    }
    static double N17813d8f313(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 2;
        } else if (i[6] <= -0.442914) {
            p = 2;
        } else if (i[6] > -0.442914) {
            p = 3;
        }
        return p;
    }
    static double N5e99275f314(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -0.444054) {
            p = WekaClassifier.N18001018315(i);
        } else if (i[5] > -0.444054) {
            p = WekaClassifier.N26d534c8323(i);
        }
        return p;
    }
    static double N18001018315(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -2.784325) {
            p = 2;
        } else if (i[5] > -2.784325) {
            p = WekaClassifier.N6a753208316(i);
        }
        return p;
    }
    static double N6a753208316(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 2;
        } else if (i[8] <= -1.690343) {
            p = 2;
        } else if (i[8] > -1.690343) {
            p = WekaClassifier.N7406178c317(i);
        }
        return p;
    }
    static double N7406178c317(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 0;
        } else if (i[10] <= 0.144383) {
            p = WekaClassifier.N63b2658c318(i);
        } else if (i[10] > 0.144383) {
            p = WekaClassifier.Nc1cefd0322(i);
        }
        return p;
    }
    static double N63b2658c318(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 2;
        } else if (i[4] <= -0.508545) {
            p = WekaClassifier.N7baa3932319(i);
        } else if (i[4] > -0.508545) {
            p = WekaClassifier.N388cb13d320(i);
        }
        return p;
    }
    static double N7baa3932319(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= -0.571443) {
            p = 0;
        } else if (i[9] > -0.571443) {
            p = 2;
        }
        return p;
    }
    static double N388cb13d320(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 2;
        } else if (i[12] <= -0.544757) {
            p = WekaClassifier.N7c727bd7321(i);
        } else if (i[12] > -0.544757) {
            p = 0;
        }
        return p;
    }
    static double N7c727bd7321(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= -0.352123) {
            p = 2;
        } else if (i[7] > -0.352123) {
            p = 0;
        }
        return p;
    }
    static double Nc1cefd0322(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 4.889251) {
            p = 1;
        } else if (i[2] > 4.889251) {
            p = 0;
        }
        return p;
    }
    static double N26d534c8323(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 2;
        } else if (i[11] <= -1.171395) {
            p = WekaClassifier.N7b8d6c76324(i);
        } else if (i[11] > -1.171395) {
            p = 0;
        }
        return p;
    }
    static double N7b8d6c76324(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -0.37768) {
            p = 2;
        } else if (i[3] > -0.37768) {
            p = 1;
        }
        return p;
    }
    static double N14ce0c13325(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= 0.408914) {
            p = WekaClassifier.N7fc71335326(i);
        } else if (i[5] > 0.408914) {
            p = WekaClassifier.N48f0143329(i);
        }
        return p;
    }
    static double N7fc71335326(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -0.177328) {
            p = WekaClassifier.N703b0b71327(i);
        } else if (i[8] > -0.177328) {
            p = 1;
        }
        return p;
    }
    static double N703b0b71327(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 1;
        } else if (i[9] <= -0.347933) {
            p = WekaClassifier.N60c537dc328(i);
        } else if (i[9] > -0.347933) {
            p = 3;
        }
        return p;
    }
    static double N60c537dc328(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= 0.728291) {
            p = 1;
        } else if (i[4] > 0.728291) {
            p = 3;
        }
        return p;
    }
    static double N48f0143329(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 0;
        } else if (i[0] <= 76.044151) {
            p = WekaClassifier.N4316f45c330(i);
        } else if (i[0] > 76.044151) {
            p = 1;
        }
        return p;
    }
    static double N4316f45c330(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= 3.310492) {
            p = WekaClassifier.N6bde1fcc331(i);
        } else if (i[3] > 3.310492) {
            p = 3;
        }
        return p;
    }
    static double N6bde1fcc331(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 6.836753) {
            p = 3;
        } else if (i[1] > 6.836753) {
            p = 0;
        }
        return p;
    }
}

