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
        p = WekaClassifier.N4805df9f715(i);
        return p;
    }
    static double N4805df9f715(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 5.6416) {
            p = WekaClassifier.Nfa8604a716(i);
        } else if (i[1] > 5.6416) {
            p = WekaClassifier.N1cd200f8813(i);
        }
        return p;
    }
    static double Nfa8604a716(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 0;
        } else if (i[2] <= 4.230667) {
            p = WekaClassifier.N2e62180e717(i);
        } else if (i[2] > 4.230667) {
            p = WekaClassifier.N19990234787(i);
        }
        return p;
    }
    static double N2e62180e717(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= -1.110476) {
            p = WekaClassifier.N3a607e99718(i);
        } else if (i[4] > -1.110476) {
            p = WekaClassifier.N3b2964ce737(i);
        }
        return p;
    }
    static double N3a607e99718(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 0;
        } else if (i[10] <= 1.364791) {
            p = WekaClassifier.N5cffb76d719(i);
        } else if (i[10] > 1.364791) {
            p = 1;
        }
        return p;
    }
    static double N5cffb76d719(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= 1.314174) {
            p = WekaClassifier.N10193688720(i);
        } else if (i[6] > 1.314174) {
            p = WekaClassifier.N5df47021736(i);
        }
        return p;
    }
    static double N10193688720(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 0;
        } else if (i[0] <= 71.669979) {
            p = WekaClassifier.N2e85eeed721(i);
        } else if (i[0] > 71.669979) {
            p = WekaClassifier.N63e8e03e727(i);
        }
        return p;
    }
    static double N2e85eeed721(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -2.720337) {
            p = 1;
        } else if (i[4] > -2.720337) {
            p = WekaClassifier.N17a8d912722(i);
        }
        return p;
    }
    static double N17a8d912722(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= 0.950346) {
            p = WekaClassifier.N36cd4055723(i);
        } else if (i[9] > 0.950346) {
            p = WekaClassifier.N3f7bd06c726(i);
        }
        return p;
    }
    static double N36cd4055723(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 0.733895) {
            p = WekaClassifier.N6f399d72724(i);
        } else if (i[2] > 0.733895) {
            p = WekaClassifier.N6e4ae4fe725(i);
        }
        return p;
    }
    static double N6f399d72724(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 1;
        } else if (i[3] <= 0.23438) {
            p = 1;
        } else if (i[3] > 0.23438) {
            p = 0;
        }
        return p;
    }
    static double N6e4ae4fe725(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 0;
        } else if (i[7] <= 1.625658) {
            p = 0;
        } else if (i[7] > 1.625658) {
            p = 1;
        }
        return p;
    }
    static double N3f7bd06c726(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= -0.004469) {
            p = 0;
        } else if (i[6] > -0.004469) {
            p = 3;
        }
        return p;
    }
    static double N63e8e03e727(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= -2.990812) {
            p = WekaClassifier.N4099233c728(i);
        } else if (i[3] > -2.990812) {
            p = WekaClassifier.N18d40530730(i);
        }
        return p;
    }
    static double N4099233c728(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 3;
        } else if (i[11] <= -2.093031) {
            p = 3;
        } else if (i[11] > -2.093031) {
            p = WekaClassifier.N794d52c5729(i);
        }
        return p;
    }
    static double N794d52c5729(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 0;
        } else if (i[8] <= 0.329121) {
            p = 0;
        } else if (i[8] > 0.329121) {
            p = 2;
        }
        return p;
    }
    static double N18d40530730(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= -0.528782) {
            p = 3;
        } else if (i[10] > -0.528782) {
            p = WekaClassifier.N3c99ef04731(i);
        }
        return p;
    }
    static double N3c99ef04731(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= -0.025538) {
            p = WekaClassifier.N3590ab68732(i);
        } else if (i[1] > -0.025538) {
            p = WekaClassifier.N26d81c65733(i);
        }
        return p;
    }
    static double N3590ab68732(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= 0.806344) {
            p = 0;
        } else if (i[9] > 0.806344) {
            p = 3;
        }
        return p;
    }
    static double N26d81c65733(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 3;
        } else if (i[2] <= -0.704567) {
            p = 3;
        } else if (i[2] > -0.704567) {
            p = WekaClassifier.N1e1d600b734(i);
        }
        return p;
    }
    static double N1e1d600b734(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 84.328433) {
            p = 1;
        } else if (i[0] > 84.328433) {
            p = WekaClassifier.N6d0f4d03735(i);
        }
        return p;
    }
    static double N6d0f4d03735(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 1;
        } else if (i[5] <= -1.106485) {
            p = 1;
        } else if (i[5] > -1.106485) {
            p = 3;
        }
        return p;
    }
    static double N5df47021736(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 1;
        } else if (i[9] <= 0.35364) {
            p = 1;
        } else if (i[9] > 0.35364) {
            p = 3;
        }
        return p;
    }
    static double N3b2964ce737(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -1.848852) {
            p = WekaClassifier.N4ec14698738(i);
        } else if (i[8] > -1.848852) {
            p = WekaClassifier.N13740da2742(i);
        }
        return p;
    }
    static double N4ec14698738(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= 0.84817) {
            p = WekaClassifier.N59316d16739(i);
        } else if (i[5] > 0.84817) {
            p = WekaClassifier.N57457454741(i);
        }
        return p;
    }
    static double N59316d16739(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= 1.310025) {
            p = 3;
        } else if (i[6] > 1.310025) {
            p = WekaClassifier.N273a6b69740(i);
        }
        return p;
    }
    static double N273a6b69740(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 2;
        } else if (i[1] <= 2.553764) {
            p = 2;
        } else if (i[1] > 2.553764) {
            p = 3;
        }
        return p;
    }
    static double N57457454741(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 0;
        } else if (i[0] <= 77.898739) {
            p = 0;
        } else if (i[0] > 77.898739) {
            p = 3;
        }
        return p;
    }
    static double N13740da2742(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -1.690729) {
            p = WekaClassifier.N41ff9b07743(i);
        } else if (i[5] > -1.690729) {
            p = WekaClassifier.N47417221747(i);
        }
        return p;
    }
    static double N41ff9b07743(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= 0.097239) {
            p = WekaClassifier.N356ad172744(i);
        } else if (i[7] > 0.097239) {
            p = WekaClassifier.N49f1f45f745(i);
        }
        return p;
    }
    static double N356ad172744(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= 0.226807) {
            p = 0;
        } else if (i[6] > 0.226807) {
            p = 2;
        }
        return p;
    }
    static double N49f1f45f745(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= -1.752864) {
            p = WekaClassifier.N7adbe9de746(i);
        } else if (i[3] > -1.752864) {
            p = 3;
        }
        return p;
    }
    static double N7adbe9de746(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= 0.429925) {
            p = 0;
        } else if (i[4] > 0.429925) {
            p = 2;
        }
        return p;
    }
    static double N47417221747(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= 0.7192) {
            p = WekaClassifier.N2443dafa748(i);
        } else if (i[9] > 0.7192) {
            p = WekaClassifier.Nae5b199771(i);
        }
        return p;
    }
    static double N2443dafa748(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= 0.775352) {
            p = WekaClassifier.N62569121749(i);
        } else if (i[4] > 0.775352) {
            p = WekaClassifier.N5c7c5979760(i);
        }
        return p;
    }
    static double N62569121749(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= 0.967452) {
            p = WekaClassifier.N47e601ac750(i);
        } else if (i[3] > 0.967452) {
            p = WekaClassifier.N4d63de99758(i);
        }
        return p;
    }
    static double N47e601ac750(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 0;
        } else if (i[11] <= 0.221413) {
            p = WekaClassifier.Nb7ab30b751(i);
        } else if (i[11] > 0.221413) {
            p = 0;
        }
        return p;
    }
    static double Nb7ab30b751(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= 0.123998) {
            p = WekaClassifier.N31543c94752(i);
        } else if (i[9] > 0.123998) {
            p = WekaClassifier.N10c1fa30754(i);
        }
        return p;
    }
    static double N31543c94752(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 0;
        } else if (i[2] <= 0.437526) {
            p = WekaClassifier.N67dd7c06753(i);
        } else if (i[2] > 0.437526) {
            p = 0;
        }
        return p;
    }
    static double N67dd7c06753(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= -0.359836) {
            p = 0;
        } else if (i[3] > -0.359836) {
            p = 1;
        }
        return p;
    }
    static double N10c1fa30754(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 0;
        } else if (i[5] <= -0.421137) {
            p = 0;
        } else if (i[5] > -0.421137) {
            p = WekaClassifier.N4e7de1c8755(i);
        }
        return p;
    }
    static double N4e7de1c8755(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -0.202728) {
            p = WekaClassifier.N5e5dd40f756(i);
        } else if (i[8] > -0.202728) {
            p = WekaClassifier.N52ecae8e757(i);
        }
        return p;
    }
    static double N5e5dd40f756(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 3.925914) {
            p = 0;
        } else if (i[1] > 3.925914) {
            p = 3;
        }
        return p;
    }
    static double N52ecae8e757(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 2;
        } else if (i[2] <= 1.401178) {
            p = 2;
        } else if (i[2] > 1.401178) {
            p = 0;
        }
        return p;
    }
    static double N4d63de99758(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 2;
        } else if (i[2] <= 1.314978) {
            p = 2;
        } else if (i[2] > 1.314978) {
            p = WekaClassifier.N6c31055c759(i);
        }
        return p;
    }
    static double N6c31055c759(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= 0.940497) {
            p = 0;
        } else if (i[6] > 0.940497) {
            p = 2;
        }
        return p;
    }
    static double N5c7c5979760(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= 0.754916) {
            p = WekaClassifier.N6b5304a6761(i);
        } else if (i[6] > 0.754916) {
            p = WekaClassifier.N62203123768(i);
        }
        return p;
    }
    static double N6b5304a6761(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -0.767597) {
            p = WekaClassifier.N38978843762(i);
        } else if (i[5] > -0.767597) {
            p = WekaClassifier.N5c6871e8763(i);
        }
        return p;
    }
    static double N38978843762(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -0.029702) {
            p = 3;
        } else if (i[8] > -0.029702) {
            p = 0;
        }
        return p;
    }
    static double N5c6871e8763(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= -0.115095) {
            p = WekaClassifier.N62e14c8d764(i);
        } else if (i[6] > -0.115095) {
            p = 0;
        }
        return p;
    }
    static double N62e14c8d764(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 0;
        } else if (i[11] <= 0.841547) {
            p = WekaClassifier.N11641243765(i);
        } else if (i[11] > 0.841547) {
            p = 3;
        }
        return p;
    }
    static double N11641243765(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 3;
        } else if (i[11] <= -0.904606) {
            p = 3;
        } else if (i[11] > -0.904606) {
            p = WekaClassifier.N153555bc766(i);
        }
        return p;
    }
    static double N153555bc766(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 0;
        } else if (i[7] <= 0.292898) {
            p = WekaClassifier.Na4d91c3767(i);
        } else if (i[7] > 0.292898) {
            p = 0;
        }
        return p;
    }
    static double Na4d91c3767(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 0;
        } else if (i[7] <= 0.056776) {
            p = 0;
        } else if (i[7] > 0.056776) {
            p = 3;
        }
        return p;
    }
    static double N62203123768(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= -1.971161) {
            p = WekaClassifier.N53e7d12e769(i);
        } else if (i[3] > -1.971161) {
            p = WekaClassifier.N6c40e65b770(i);
        }
        return p;
    }
    static double N53e7d12e769(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -3.993645) {
            p = 2;
        } else if (i[3] > -3.993645) {
            p = 0;
        }
        return p;
    }
    static double N6c40e65b770(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 2;
        } else if (i[8] <= -1.417628) {
            p = 2;
        } else if (i[8] > -1.417628) {
            p = 3;
        }
        return p;
    }
    static double Nae5b199771(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -0.782364) {
            p = WekaClassifier.N69af20cf772(i);
        } else if (i[8] > -0.782364) {
            p = WekaClassifier.N799d75dc778(i);
        }
        return p;
    }
    static double N69af20cf772(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -0.342236) {
            p = WekaClassifier.N42ce275773(i);
        } else if (i[3] > -0.342236) {
            p = WekaClassifier.N6fb5be95774(i);
        }
        return p;
    }
    static double N42ce275773(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 3;
        } else if (i[12] <= -0.249981) {
            p = 3;
        } else if (i[12] > -0.249981) {
            p = 2;
        }
        return p;
    }
    static double N6fb5be95774(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= -0.555639) {
            p = 3;
        } else if (i[10] > -0.555639) {
            p = WekaClassifier.N487ba383775(i);
        }
        return p;
    }
    static double N487ba383775(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 1.200954) {
            p = 1;
        } else if (i[2] > 1.200954) {
            p = WekaClassifier.N58c24b1b776(i);
        }
        return p;
    }
    static double N58c24b1b776(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 1;
        } else if (i[3] <= 0.300857) {
            p = WekaClassifier.N3b1e253c777(i);
        } else if (i[3] > 0.300857) {
            p = 3;
        }
        return p;
    }
    static double N3b1e253c777(double []i) {
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
    static double N799d75dc778(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 1;
        } else if (i[12] <= -1.13606) {
            p = WekaClassifier.N6cefb6d7779(i);
        } else if (i[12] > -1.13606) {
            p = WekaClassifier.N26bfa2c2780(i);
        }
        return p;
    }
    static double N6cefb6d7779(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -0.009969) {
            p = 1;
        } else if (i[4] > -0.009969) {
            p = 3;
        }
        return p;
    }
    static double N26bfa2c2780(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 0;
        } else if (i[10] <= 1.381584) {
            p = WekaClassifier.N6c4254ec781(i);
        } else if (i[10] > 1.381584) {
            p = 2;
        }
        return p;
    }
    static double N6c4254ec781(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 0.32402) {
            p = 3;
        } else if (i[1] > 0.32402) {
            p = WekaClassifier.N7e63ef2d782(i);
        }
        return p;
    }
    static double N7e63ef2d782(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 0;
        } else if (i[5] <= 0.442911) {
            p = WekaClassifier.N6faba738783(i);
        } else if (i[5] > 0.442911) {
            p = 0;
        }
        return p;
    }
    static double N6faba738783(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= -1.058581) {
            p = 0;
        } else if (i[6] > -1.058581) {
            p = WekaClassifier.N34d9b1bd784(i);
        }
        return p;
    }
    static double N34d9b1bd784(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 3;
        } else if (i[11] <= 0.624212) {
            p = WekaClassifier.N4ac276fe785(i);
        } else if (i[11] > 0.624212) {
            p = WekaClassifier.N2b39e20c786(i);
        }
        return p;
    }
    static double N4ac276fe785(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= -0.369886) {
            p = 3;
        } else if (i[10] > -0.369886) {
            p = 2;
        }
        return p;
    }
    static double N2b39e20c786(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 2;
        } else if (i[2] <= 0.681501) {
            p = 2;
        } else if (i[2] > 0.681501) {
            p = 0;
        }
        return p;
    }
    static double N19990234787(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= -0.046712) {
            p = WekaClassifier.N60b41ce3788(i);
        } else if (i[6] > -0.046712) {
            p = WekaClassifier.N50fc950806(i);
        }
        return p;
    }
    static double N60b41ce3788(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 0;
        } else if (i[10] <= 0.834016) {
            p = WekaClassifier.N3998f38d789(i);
        } else if (i[10] > 0.834016) {
            p = WekaClassifier.N2cced69c804(i);
        }
        return p;
    }
    static double N3998f38d789(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= -1.37223) {
            p = 2;
        } else if (i[7] > -1.37223) {
            p = WekaClassifier.N5dd54f30790(i);
        }
        return p;
    }
    static double N5dd54f30790(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 0;
        } else if (i[0] <= 65.324937) {
            p = 0;
        } else if (i[0] > 65.324937) {
            p = WekaClassifier.Nc0c7e1c791(i);
        }
        return p;
    }
    static double Nc0c7e1c791(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 69.724977) {
            p = 3;
        } else if (i[0] > 69.724977) {
            p = WekaClassifier.N4c1f387a792(i);
        }
        return p;
    }
    static double N4c1f387a792(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= 0.210434) {
            p = WekaClassifier.N3265beef793(i);
        } else if (i[3] > 0.210434) {
            p = WekaClassifier.N422474a5802(i);
        }
        return p;
    }
    static double N3265beef793(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= 0.859305) {
            p = WekaClassifier.N45becb5c794(i);
        } else if (i[5] > 0.859305) {
            p = WekaClassifier.N1b92a03801(i);
        }
        return p;
    }
    static double N45becb5c794(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -0.551642) {
            p = WekaClassifier.N2aadb169795(i);
        } else if (i[5] > -0.551642) {
            p = WekaClassifier.N74ffc1f2799(i);
        }
        return p;
    }
    static double N2aadb169795(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 2;
        } else if (i[2] <= 9.29168) {
            p = WekaClassifier.N1f4480ae796(i);
        } else if (i[2] > 9.29168) {
            p = 0;
        }
        return p;
    }
    static double N1f4480ae796(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 2;
        } else if (i[12] <= 0.479987) {
            p = WekaClassifier.N49d76f797(i);
        } else if (i[12] > 0.479987) {
            p = 3;
        }
        return p;
    }
    static double N49d76f797(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 2;
        } else if (i[4] <= -0.719133) {
            p = WekaClassifier.N339e0811798(i);
        } else if (i[4] > -0.719133) {
            p = 2;
        }
        return p;
    }
    static double N339e0811798(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 4.454751) {
            p = 3;
        } else if (i[1] > 4.454751) {
            p = 2;
        }
        return p;
    }
    static double N74ffc1f2799(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 83.477812) {
            p = WekaClassifier.N4f856e33800(i);
        } else if (i[0] > 83.477812) {
            p = 0;
        }
        return p;
    }
    static double N4f856e33800(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= 0.783088) {
            p = 0;
        } else if (i[9] > 0.783088) {
            p = 2;
        }
        return p;
    }
    static double N1b92a03801(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 75.752715) {
            p = 3;
        } else if (i[0] > 75.752715) {
            p = 0;
        }
        return p;
    }
    static double N422474a5802(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 4.081209) {
            p = WekaClassifier.N48dedd42803(i);
        } else if (i[1] > 4.081209) {
            p = 3;
        }
        return p;
    }
    static double N48dedd42803(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 0;
        } else if (i[10] <= -0.047988) {
            p = 0;
        } else if (i[10] > -0.047988) {
            p = 3;
        }
        return p;
    }
    static double N2cced69c804(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -0.223053) {
            p = 1;
        } else if (i[4] > -0.223053) {
            p = WekaClassifier.N64ef1834805(i);
        }
        return p;
    }
    static double N64ef1834805(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 0;
        } else if (i[2] <= 5.879245) {
            p = 0;
        } else if (i[2] > 5.879245) {
            p = 2;
        }
        return p;
    }
    static double N50fc950806(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -0.378175) {
            p = WekaClassifier.N3b85307e807(i);
        } else if (i[5] > -0.378175) {
            p = WekaClassifier.N629f2b7810(i);
        }
        return p;
    }
    static double N3b85307e807(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -1.596098) {
            p = 2;
        } else if (i[3] > -1.596098) {
            p = WekaClassifier.N61256ba4808(i);
        }
        return p;
    }
    static double N61256ba4808(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 2.174555) {
            p = WekaClassifier.N7d17f10c809(i);
        } else if (i[1] > 2.174555) {
            p = 2;
        }
        return p;
    }
    static double N7d17f10c809(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 3;
        } else if (i[4] <= 2.227165) {
            p = 3;
        } else if (i[4] > 2.227165) {
            p = 2;
        }
        return p;
    }
    static double N629f2b7810(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 2;
        } else if (i[4] <= 1.415398) {
            p = WekaClassifier.N14bd34cc811(i);
        } else if (i[4] > 1.415398) {
            p = 0;
        }
        return p;
    }
    static double N14bd34cc811(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 3;
        } else if (i[4] <= -1.721212) {
            p = 3;
        } else if (i[4] > -1.721212) {
            p = WekaClassifier.N5e8f15b4812(i);
        }
        return p;
    }
    static double N5e8f15b4812(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 2;
        } else if (i[8] <= -0.342091) {
            p = 2;
        } else if (i[8] > -0.342091) {
            p = 3;
        }
        return p;
    }
    static double N1cd200f8813(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 62.762997) {
            p = WekaClassifier.N5527f59f814(i);
        } else if (i[0] > 62.762997) {
            p = WekaClassifier.N2bb6f4aa842(i);
        }
        return p;
    }
    static double N5527f59f814(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 0.848121) {
            p = WekaClassifier.N2841b0a3815(i);
        } else if (i[2] > 0.848121) {
            p = WekaClassifier.N77f3a45e826(i);
        }
        return p;
    }
    static double N2841b0a3815(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 1;
        } else if (i[5] <= -0.403137) {
            p = WekaClassifier.Nec522aa816(i);
        } else if (i[5] > -0.403137) {
            p = WekaClassifier.N6aeb6ae4820(i);
        }
        return p;
    }
    static double Nec522aa816(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 1;
        } else if (i[3] <= 0.424107) {
            p = WekaClassifier.N29c264a817(i);
        } else if (i[3] > 0.424107) {
            p = 3;
        }
        return p;
    }
    static double N29c264a817(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 60.002701) {
            p = WekaClassifier.N687da08b818(i);
        } else if (i[0] > 60.002701) {
            p = WekaClassifier.N4d9cc18f819(i);
        }
        return p;
    }
    static double N687da08b818(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 0.547474) {
            p = 1;
        } else if (i[2] > 0.547474) {
            p = 2;
        }
        return p;
    }
    static double N4d9cc18f819(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= -0.489448) {
            p = 0;
        } else if (i[4] > -0.489448) {
            p = 2;
        }
        return p;
    }
    static double N6aeb6ae4820(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -0.189596) {
            p = 1;
        } else if (i[4] > -0.189596) {
            p = WekaClassifier.N9a6af85821(i);
        }
        return p;
    }
    static double N9a6af85821(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 59.457859) {
            p = 1;
        } else if (i[0] > 59.457859) {
            p = WekaClassifier.Nc5a2fc2822(i);
        }
        return p;
    }
    static double Nc5a2fc2822(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 2;
        } else if (i[10] <= 1.166988) {
            p = WekaClassifier.N2761177f823(i);
        } else if (i[10] > 1.166988) {
            p = 1;
        }
        return p;
    }
    static double N2761177f823(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 1;
        } else if (i[6] <= -0.585556) {
            p = 1;
        } else if (i[6] > -0.585556) {
            p = WekaClassifier.N166ce53d824(i);
        }
        return p;
    }
    static double N166ce53d824(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= 0.703773) {
            p = 2;
        } else if (i[7] > 0.703773) {
            p = WekaClassifier.N2a8aaaf2825(i);
        }
        return p;
    }
    static double N2a8aaaf2825(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 2;
        } else if (i[1] <= 6.884017) {
            p = 2;
        } else if (i[1] > 6.884017) {
            p = 1;
        }
        return p;
    }
    static double N77f3a45e826(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -0.419358) {
            p = WekaClassifier.N58068f30827(i);
        } else if (i[5] > -0.419358) {
            p = WekaClassifier.N4fbcf3b8835(i);
        }
        return p;
    }
    static double N58068f30827(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 3;
        } else if (i[11] <= -0.759248) {
            p = 3;
        } else if (i[11] > -0.759248) {
            p = WekaClassifier.N29b2dc00828(i);
        }
        return p;
    }
    static double N29b2dc00828(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 2;
        } else if (i[1] <= 7.331481) {
            p = WekaClassifier.N56903efe829(i);
        } else if (i[1] > 7.331481) {
            p = 2;
        }
        return p;
    }
    static double N56903efe829(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= 1.554017) {
            p = WekaClassifier.N3c2ba126830(i);
        } else if (i[3] > 1.554017) {
            p = 3;
        }
        return p;
    }
    static double N3c2ba126830(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -0.796773) {
            p = 3;
        } else if (i[6] > -0.796773) {
            p = WekaClassifier.N50b8c69c831(i);
        }
        return p;
    }
    static double N50b8c69c831(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 2;
        } else if (i[1] <= 6.696746) {
            p = WekaClassifier.N6f554257832(i);
        } else if (i[1] > 6.696746) {
            p = 2;
        }
        return p;
    }
    static double N6f554257832(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -0.084704) {
            p = 2;
        } else if (i[3] > -0.084704) {
            p = WekaClassifier.N3865f68d833(i);
        }
        return p;
    }
    static double N3865f68d833(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 60.499409) {
            p = 3;
        } else if (i[0] > 60.499409) {
            p = WekaClassifier.N59a65236834(i);
        }
        return p;
    }
    static double N59a65236834(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 3;
        } else if (i[3] <= 0.447738) {
            p = 3;
        } else if (i[3] > 0.447738) {
            p = 2;
        }
        return p;
    }
    static double N4fbcf3b8835(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 2;
        } else if (i[12] <= 0.046839) {
            p = WekaClassifier.Nabe57e2836(i);
        } else if (i[12] > 0.046839) {
            p = WekaClassifier.N76a4dfcd838(i);
        }
        return p;
    }
    static double Nabe57e2836(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -0.067814) {
            p = 2;
        } else if (i[3] > -0.067814) {
            p = WekaClassifier.N1df809a6837(i);
        }
        return p;
    }
    static double N1df809a6837(double []i) {
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
    static double N76a4dfcd838(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= 1.079666) {
            p = WekaClassifier.N5eadc392839(i);
        } else if (i[5] > 1.079666) {
            p = 1;
        }
        return p;
    }
    static double N5eadc392839(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 1;
        } else if (i[6] <= 0.340676) {
            p = WekaClassifier.N26d48ee2840(i);
        } else if (i[6] > 0.340676) {
            p = WekaClassifier.N7bbc06a7841(i);
        }
        return p;
    }
    static double N26d48ee2840(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= 0.251267) {
            p = 1;
        } else if (i[4] > 0.251267) {
            p = 0;
        }
        return p;
    }
    static double N7bbc06a7841(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= 1.196628) {
            p = 2;
        } else if (i[7] > 1.196628) {
            p = 1;
        }
        return p;
    }
    static double N2bb6f4aa842(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 71.491756) {
            p = WekaClassifier.N1b37031d843(i);
        } else if (i[0] > 71.491756) {
            p = WekaClassifier.N7f0dbb18884(i);
        }
        return p;
    }
    static double N1b37031d843(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 2.471518) {
            p = WekaClassifier.N19162d07844(i);
        } else if (i[2] > 2.471518) {
            p = WekaClassifier.N2960447a865(i);
        }
        return p;
    }
    static double N19162d07844(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -1.257191) {
            p = WekaClassifier.N28499bc845(i);
        } else if (i[5] > -1.257191) {
            p = WekaClassifier.N333ea708849(i);
        }
        return p;
    }
    static double N28499bc845(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 1;
        } else if (i[3] <= -0.043044) {
            p = WekaClassifier.N1e8b2ee2846(i);
        } else if (i[3] > -0.043044) {
            p = WekaClassifier.N3d87e9c5847(i);
        }
        return p;
    }
    static double N1e8b2ee2846(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 0.738122) {
            p = 1;
        } else if (i[2] > 0.738122) {
            p = 2;
        }
        return p;
    }
    static double N3d87e9c5847(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 65.988157) {
            p = 3;
        } else if (i[0] > 65.988157) {
            p = WekaClassifier.N15518567848(i);
        }
        return p;
    }
    static double N15518567848(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -1.762852) {
            p = 3;
        } else if (i[5] > -1.762852) {
            p = 1;
        }
        return p;
    }
    static double N333ea708849(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -2.336002) {
            p = WekaClassifier.N748573b3850(i);
        } else if (i[3] > -2.336002) {
            p = WekaClassifier.N6f2dbc34852(i);
        }
        return p;
    }
    static double N748573b3850(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 8.032547) {
            p = WekaClassifier.N764e6527851(i);
        } else if (i[1] > 8.032547) {
            p = 2;
        }
        return p;
    }
    static double N764e6527851(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= -1.675347) {
            p = 0;
        } else if (i[4] > -1.675347) {
            p = 1;
        }
        return p;
    }
    static double N6f2dbc34852(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= 1.358334) {
            p = WekaClassifier.N296d403e853(i);
        } else if (i[4] > 1.358334) {
            p = WekaClassifier.N5a6104f8864(i);
        }
        return p;
    }
    static double N296d403e853(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 1;
        } else if (i[6] <= -0.479822) {
            p = WekaClassifier.N76aaa64b854(i);
        } else if (i[6] > -0.479822) {
            p = WekaClassifier.N65da1281860(i);
        }
        return p;
    }
    static double N76aaa64b854(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 0.466011) {
            p = WekaClassifier.N734892e4855(i);
        } else if (i[2] > 0.466011) {
            p = WekaClassifier.N32a98e0b857(i);
        }
        return p;
    }
    static double N734892e4855(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 1;
        } else if (i[1] <= 8.19026) {
            p = WekaClassifier.N71065ca5856(i);
        } else if (i[1] > 8.19026) {
            p = 3;
        }
        return p;
    }
    static double N71065ca5856(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 2;
        } else if (i[10] <= -0.367264) {
            p = 2;
        } else if (i[10] > -0.367264) {
            p = 1;
        }
        return p;
    }
    static double N32a98e0b857(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 2;
        } else if (i[10] <= -0.886592) {
            p = 2;
        } else if (i[10] > -0.886592) {
            p = WekaClassifier.N1112feeb858(i);
        }
        return p;
    }
    static double N1112feeb858(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -0.371441) {
            p = 1;
        } else if (i[4] > -0.371441) {
            p = WekaClassifier.N267a819f859(i);
        }
        return p;
    }
    static double N267a819f859(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 1;
        } else if (i[10] <= -0.093985) {
            p = 1;
        } else if (i[10] > -0.093985) {
            p = 2;
        }
        return p;
    }
    static double N65da1281860(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 1;
        } else if (i[3] <= -0.339051) {
            p = WekaClassifier.N1bfd11e7861(i);
        } else if (i[3] > -0.339051) {
            p = 1;
        }
        return p;
    }
    static double N1bfd11e7861(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 1.036735) {
            p = 1;
        } else if (i[2] > 1.036735) {
            p = WekaClassifier.N1d1e41d5862(i);
        }
        return p;
    }
    static double N1d1e41d5862(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 64.049766) {
            p = 2;
        } else if (i[0] > 64.049766) {
            p = WekaClassifier.N6f9a5d90863(i);
        }
        return p;
    }
    static double N6f9a5d90863(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 1;
        } else if (i[6] <= 1.410017) {
            p = 1;
        } else if (i[6] > 1.410017) {
            p = 2;
        }
        return p;
    }
    static double N5a6104f8864(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 6.891079) {
            p = 0;
        } else if (i[1] > 6.891079) {
            p = 2;
        }
        return p;
    }
    static double N2960447a865(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 2;
        } else if (i[8] <= -1.448279) {
            p = WekaClassifier.N461fa86a866(i);
        } else if (i[8] > -1.448279) {
            p = WekaClassifier.N2a85464869(i);
        }
        return p;
    }
    static double N461fa86a866(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -2.143375) {
            p = 3;
        } else if (i[8] > -2.143375) {
            p = WekaClassifier.N7bd41be4867(i);
        }
        return p;
    }
    static double N7bd41be4867(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= 1.639669) {
            p = 2;
        } else if (i[3] > 1.639669) {
            p = WekaClassifier.N294096a2868(i);
        }
        return p;
    }
    static double N294096a2868(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 1;
        } else if (i[5] <= -0.936273) {
            p = 1;
        } else if (i[5] > -0.936273) {
            p = 0;
        }
        return p;
    }
    static double N2a85464869(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 4.362806) {
            p = WekaClassifier.N39cff0a3870(i);
        } else if (i[2] > 4.362806) {
            p = WekaClassifier.N47fe5ac878(i);
        }
        return p;
    }
    static double N39cff0a3870(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= 1.911942) {
            p = WekaClassifier.N621fc745871(i);
        } else if (i[3] > 1.911942) {
            p = WekaClassifier.N4edefafa877(i);
        }
        return p;
    }
    static double N621fc745871(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 8.079157) {
            p = WekaClassifier.N4f47a822872(i);
        } else if (i[1] > 8.079157) {
            p = WekaClassifier.N49007d70874(i);
        }
        return p;
    }
    static double N4f47a822872(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 0;
        } else if (i[12] <= 0.493266) {
            p = WekaClassifier.Nf0cdeda873(i);
        } else if (i[12] > 0.493266) {
            p = 1;
        }
        return p;
    }
    static double Nf0cdeda873(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -1.960067) {
            p = 1;
        } else if (i[4] > -1.960067) {
            p = 0;
        }
        return p;
    }
    static double N49007d70874(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= 0.202991) {
            p = WekaClassifier.N5539befa875(i);
        } else if (i[3] > 0.202991) {
            p = 1;
        }
        return p;
    }
    static double N5539befa875(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 3;
        } else if (i[7] <= -0.748129) {
            p = 3;
        } else if (i[7] > -0.748129) {
            p = WekaClassifier.N274d0ac7876(i);
        }
        return p;
    }
    static double N274d0ac7876(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 68.709283) {
            p = 2;
        } else if (i[0] > 68.709283) {
            p = 0;
        }
        return p;
    }
    static double N4edefafa877(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 3;
        } else if (i[12] <= -1.718201) {
            p = 3;
        } else if (i[12] > -1.718201) {
            p = 1;
        }
        return p;
    }
    static double N47fe5ac878(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -1.237857) {
            p = 2;
        } else if (i[5] > -1.237857) {
            p = WekaClassifier.N1c2945b7879(i);
        }
        return p;
    }
    static double N1c2945b7879(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 12.325486) {
            p = WekaClassifier.N537d7fc7880(i);
        } else if (i[1] > 12.325486) {
            p = 1;
        }
        return p;
    }
    static double N537d7fc7880(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 3;
        } else if (i[12] <= -1.158815) {
            p = WekaClassifier.N6acd4678881(i);
        } else if (i[12] > -1.158815) {
            p = WekaClassifier.N11649c08882(i);
        }
        return p;
    }
    static double N6acd4678881(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 0;
        } else if (i[0] <= 68.25198) {
            p = 0;
        } else if (i[0] > 68.25198) {
            p = 3;
        }
        return p;
    }
    static double N11649c08882(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 0;
        } else if (i[11] <= 0.727918) {
            p = 0;
        } else if (i[11] > 0.727918) {
            p = WekaClassifier.N47b6776e883(i);
        }
        return p;
    }
    static double N47b6776e883(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 3;
        } else if (i[9] <= 0.544954) {
            p = 3;
        } else if (i[9] > 0.544954) {
            p = 0;
        }
        return p;
    }
    static double N7f0dbb18884(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= 1.369801) {
            p = WekaClassifier.N7ff3cc07885(i);
        } else if (i[3] > 1.369801) {
            p = WekaClassifier.N33e874f1021(i);
        }
        return p;
    }
    static double N7ff3cc07885(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 2;
        } else if (i[4] <= 0.278567) {
            p = WekaClassifier.N4ac29b2d886(i);
        } else if (i[4] > 0.278567) {
            p = WekaClassifier.N41079185998(i);
        }
        return p;
    }
    static double N4ac29b2d886(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 97.227014) {
            p = WekaClassifier.N3e3b881c887(i);
        } else if (i[0] > 97.227014) {
            p = WekaClassifier.N7c89c305995(i);
        }
        return p;
    }
    static double N3e3b881c887(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 2;
        } else if (i[1] <= 13.0464) {
            p = WekaClassifier.N2cfc21b8888(i);
        } else if (i[1] > 13.0464) {
            p = WekaClassifier.N76a43091987(i);
        }
        return p;
    }
    static double N2cfc21b8888(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 3;
        } else if (i[2] <= 5.060304) {
            p = WekaClassifier.N4d8e43d4889(i);
        } else if (i[2] > 5.060304) {
            p = WekaClassifier.N1567ec1d981(i);
        }
        return p;
    }
    static double N4d8e43d4889(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -0.424811) {
            p = WekaClassifier.N134bb2bb890(i);
        } else if (i[6] > -0.424811) {
            p = WekaClassifier.N4cf0fbd9953(i);
        }
        return p;
    }
    static double N134bb2bb890(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -0.073007) {
            p = WekaClassifier.N71d2a3a6891(i);
        } else if (i[8] > -0.073007) {
            p = WekaClassifier.N4551a627937(i);
        }
        return p;
    }
    static double N71d2a3a6891(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= 0.266391) {
            p = WekaClassifier.N3ceeadc5892(i);
        } else if (i[10] > 0.266391) {
            p = WekaClassifier.N1ee17dd8923(i);
        }
        return p;
    }
    static double N3ceeadc5892(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 3;
        } else if (i[12] <= 0.182956) {
            p = WekaClassifier.N3c1d96f893(i);
        } else if (i[12] > 0.182956) {
            p = WekaClassifier.N4ee65a0a917(i);
        }
        return p;
    }
    static double N3c1d96f893(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 3;
        } else if (i[7] <= 1.821785) {
            p = WekaClassifier.N4d517dc6894(i);
        } else if (i[7] > 1.821785) {
            p = WekaClassifier.N6775ff39914(i);
        }
        return p;
    }
    static double N4d517dc6894(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 3;
        } else if (i[4] <= -1.436082) {
            p = WekaClassifier.N29fa3859895(i);
        } else if (i[4] > -1.436082) {
            p = WekaClassifier.N1dd48701903(i);
        }
        return p;
    }
    static double N29fa3859895(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 92.282635) {
            p = WekaClassifier.N60332826896(i);
        } else if (i[0] > 92.282635) {
            p = 3;
        }
        return p;
    }
    static double N60332826896(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 3;
        } else if (i[9] <= 0.455938) {
            p = WekaClassifier.N6db49fee897(i);
        } else if (i[9] > 0.455938) {
            p = WekaClassifier.N238fc356902(i);
        }
        return p;
    }
    static double N6db49fee897(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 3;
        } else if (i[7] <= 1.114903) {
            p = WekaClassifier.N2b4d60d3898(i);
        } else if (i[7] > 1.114903) {
            p = 1;
        }
        return p;
    }
    static double N2b4d60d3898(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -0.17409) {
            p = WekaClassifier.N530dad13899(i);
        } else if (i[8] > -0.17409) {
            p = 1;
        }
        return p;
    }
    static double N530dad13899(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= 0.084824) {
            p = WekaClassifier.N2a06cd4c900(i);
        } else if (i[10] > 0.084824) {
            p = 1;
        }
        return p;
    }
    static double N2a06cd4c900(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 83.919668) {
            p = WekaClassifier.N63846c0d901(i);
        } else if (i[0] > 83.919668) {
            p = 3;
        }
        return p;
    }
    static double N63846c0d901(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 3;
        } else if (i[11] <= -0.663389) {
            p = 3;
        } else if (i[11] > -0.663389) {
            p = 1;
        }
        return p;
    }
    static double N238fc356902(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 1;
        } else if (i[8] <= -0.338464) {
            p = 1;
        } else if (i[8] > -0.338464) {
            p = 2;
        }
        return p;
    }
    static double N1dd48701903(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= -2.574413) {
            p = 2;
        } else if (i[7] > -2.574413) {
            p = WekaClassifier.N1a4555a904(i);
        }
        return p;
    }
    static double N1a4555a904(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -1.656193) {
            p = WekaClassifier.N4180a567905(i);
        } else if (i[6] > -1.656193) {
            p = WekaClassifier.N251d3b65907(i);
        }
        return p;
    }
    static double N4180a567905(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 3;
        } else if (i[9] <= -0.926131) {
            p = WekaClassifier.N1cc84b72906(i);
        } else if (i[9] > -0.926131) {
            p = 3;
        }
        return p;
    }
    static double N1cc84b72906(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 0;
        } else if (i[10] <= -0.494925) {
            p = 0;
        } else if (i[10] > -0.494925) {
            p = 3;
        }
        return p;
    }
    static double N251d3b65907(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 0;
        } else if (i[0] <= 87.462084) {
            p = WekaClassifier.N6b0a419908(i);
        } else if (i[0] > 87.462084) {
            p = WekaClassifier.N6dfb0c3b913(i);
        }
        return p;
    }
    static double N6b0a419908(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 0;
        } else if (i[0] <= 77.080044) {
            p = WekaClassifier.N425f9235909(i);
        } else if (i[0] > 77.080044) {
            p = WekaClassifier.N50981423911(i);
        }
        return p;
    }
    static double N425f9235909(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 3;
        } else if (i[4] <= -0.304404) {
            p = 3;
        } else if (i[4] > -0.304404) {
            p = WekaClassifier.N1c12d2d7910(i);
        }
        return p;
    }
    static double N1c12d2d7910(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 73.617166) {
            p = 2;
        } else if (i[0] > 73.617166) {
            p = 0;
        }
        return p;
    }
    static double N50981423911(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= -0.035103) {
            p = WekaClassifier.N538bf245912(i);
        } else if (i[4] > -0.035103) {
            p = 2;
        }
        return p;
    }
    static double N538bf245912(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 0;
        } else if (i[8] <= -0.614827) {
            p = 0;
        } else if (i[8] > -0.614827) {
            p = 2;
        }
        return p;
    }
    static double N6dfb0c3b913(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= -1.125002) {
            p = 0;
        } else if (i[9] > -1.125002) {
            p = 3;
        }
        return p;
    }
    static double N6775ff39914(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= -3.216201) {
            p = 0;
        } else if (i[6] > -3.216201) {
            p = WekaClassifier.N775cd6f8915(i);
        }
        return p;
    }
    static double N775cd6f8915(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 2;
        } else if (i[1] <= 11.483535) {
            p = WekaClassifier.N7b490b8c916(i);
        } else if (i[1] > 11.483535) {
            p = 3;
        }
        return p;
    }
    static double N7b490b8c916(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -2.107125) {
            p = 3;
        } else if (i[6] > -2.107125) {
            p = 2;
        }
        return p;
    }
    static double N4ee65a0a917(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 80.341254) {
            p = 2;
        } else if (i[0] > 80.341254) {
            p = WekaClassifier.N622f8d8918(i);
        }
        return p;
    }
    static double N622f8d8918(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 1;
        } else if (i[11] <= -1.317753) {
            p = WekaClassifier.N17d815f2919(i);
        } else if (i[11] > -1.317753) {
            p = WekaClassifier.N58b44161921(i);
        }
        return p;
    }
    static double N17d815f2919(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 2;
        } else if (i[6] <= -1.90011) {
            p = 2;
        } else if (i[6] > -1.90011) {
            p = WekaClassifier.N247e79ee920(i);
        }
        return p;
    }
    static double N247e79ee920(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 1;
        } else if (i[6] <= -0.770343) {
            p = 1;
        } else if (i[6] > -0.770343) {
            p = 2;
        }
        return p;
    }
    static double N58b44161921(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -1.243991) {
            p = 3;
        } else if (i[5] > -1.243991) {
            p = WekaClassifier.N49c18697922(i);
        }
        return p;
    }
    static double N49c18697922(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 3;
        } else if (i[11] <= -0.665759) {
            p = 3;
        } else if (i[11] > -0.665759) {
            p = 1;
        }
        return p;
    }
    static double N1ee17dd8923(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 3;
        } else if (i[3] <= -3.269296) {
            p = 3;
        } else if (i[3] > -3.269296) {
            p = WekaClassifier.N4987c6e3924(i);
        }
        return p;
    }
    static double N4987c6e3924(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 88.668991) {
            p = WekaClassifier.N334229fb925(i);
        } else if (i[0] > 88.668991) {
            p = WekaClassifier.N2b39839c933(i);
        }
        return p;
    }
    static double N334229fb925(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -1.935292) {
            p = WekaClassifier.N76f2f43a926(i);
        } else if (i[6] > -1.935292) {
            p = WekaClassifier.N3600d45e929(i);
        }
        return p;
    }
    static double N76f2f43a926(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 3;
        } else if (i[11] <= -0.118546) {
            p = WekaClassifier.N63e85881927(i);
        } else if (i[11] > -0.118546) {
            p = WekaClassifier.N14af2ac1928(i);
        }
        return p;
    }
    static double N63e85881927(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 9.175788) {
            p = 0;
        } else if (i[1] > 9.175788) {
            p = 3;
        }
        return p;
    }
    static double N14af2ac1928(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 3;
        } else if (i[0] <= 79.895179) {
            p = 3;
        } else if (i[0] > 79.895179) {
            p = 1;
        }
        return p;
    }
    static double N3600d45e929(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 0;
        } else if (i[10] <= 0.861589) {
            p = WekaClassifier.N5732b580930(i);
        } else if (i[10] > 0.861589) {
            p = WekaClassifier.N76bfd3b7931(i);
        }
        return p;
    }
    static double N5732b580930(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 1;
        } else if (i[6] <= -1.388773) {
            p = 1;
        } else if (i[6] > -1.388773) {
            p = 0;
        }
        return p;
    }
    static double N76bfd3b7931(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 2;
        } else if (i[12] <= -0.30677) {
            p = WekaClassifier.N1b2b0683932(i);
        } else if (i[12] > -0.30677) {
            p = 1;
        }
        return p;
    }
    static double N1b2b0683932(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 1;
        } else if (i[1] <= 9.827366) {
            p = 1;
        } else if (i[1] > 9.827366) {
            p = 2;
        }
        return p;
    }
    static double N2b39839c933(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 1;
        } else if (i[11] <= -1.349592) {
            p = 1;
        } else if (i[11] > -1.349592) {
            p = WekaClassifier.N69e5bdce934(i);
        }
        return p;
    }
    static double N69e5bdce934(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -1.775186) {
            p = WekaClassifier.N614fe92e935(i);
        } else if (i[5] > -1.775186) {
            p = 1;
        }
        return p;
    }
    static double N614fe92e935(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -2.354014) {
            p = WekaClassifier.N2213e49a936(i);
        } else if (i[4] > -2.354014) {
            p = 3;
        }
        return p;
    }
    static double N2213e49a936(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 3;
        } else if (i[3] <= -0.849386) {
            p = 3;
        } else if (i[3] > -0.849386) {
            p = 1;
        }
        return p;
    }
    static double N4551a627937(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -2.045354) {
            p = WekaClassifier.N19e688e938(i);
        } else if (i[4] > -2.045354) {
            p = WekaClassifier.N301ac8d2943(i);
        }
        return p;
    }
    static double N19e688e938(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 9.200324) {
            p = WekaClassifier.N1f86e70a939(i);
        } else if (i[1] > 9.200324) {
            p = WekaClassifier.N6aa40dac941(i);
        }
        return p;
    }
    static double N1f86e70a939(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= -0.590969) {
            p = 1;
        } else if (i[2] > -0.590969) {
            p = WekaClassifier.N220cf754940(i);
        }
        return p;
    }
    static double N220cf754940(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 3;
        } else if (i[7] <= -0.220786) {
            p = 3;
        } else if (i[7] > -0.220786) {
            p = 0;
        }
        return p;
    }
    static double N6aa40dac941(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= -3.308504) {
            p = 0;
        } else if (i[4] > -3.308504) {
            p = WekaClassifier.N180cd26e942(i);
        }
        return p;
    }
    static double N180cd26e942(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 1;
        } else if (i[8] <= 1.263274) {
            p = 1;
        } else if (i[8] > 1.263274) {
            p = 0;
        }
        return p;
    }
    static double N301ac8d2943(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 2;
        } else if (i[12] <= 0.517416) {
            p = WekaClassifier.N75e92fd2944(i);
        } else if (i[12] > 0.517416) {
            p = 1;
        }
        return p;
    }
    static double N75e92fd2944(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 2;
        } else if (i[2] <= 1.928604) {
            p = WekaClassifier.N3fea85ae945(i);
        } else if (i[2] > 1.928604) {
            p = WekaClassifier.N9773ef6952(i);
        }
        return p;
    }
    static double N3fea85ae945(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -3.570692) {
            p = WekaClassifier.N418baf9f946(i);
        } else if (i[3] > -3.570692) {
            p = WekaClassifier.N1b9a9faf948(i);
        }
        return p;
    }
    static double N418baf9f946(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 2;
        } else if (i[2] <= 1.147092) {
            p = WekaClassifier.N2731a324947(i);
        } else if (i[2] > 1.147092) {
            p = 3;
        }
        return p;
    }
    static double N2731a324947(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= 0.179492) {
            p = 2;
        } else if (i[5] > 0.179492) {
            p = 0;
        }
        return p;
    }
    static double N1b9a9faf948(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -2.123757) {
            p = WekaClassifier.N70b6be87949(i);
        } else if (i[5] > -2.123757) {
            p = WekaClassifier.N6c5d1059950(i);
        }
        return p;
    }
    static double N70b6be87949(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 0.384435) {
            p = 1;
        } else if (i[2] > 0.384435) {
            p = 3;
        }
        return p;
    }
    static double N6c5d1059950(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 1;
        } else if (i[12] <= -0.653229) {
            p = 1;
        } else if (i[12] > -0.653229) {
            p = WekaClassifier.N465fb675951(i);
        }
        return p;
    }
    static double N465fb675951(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 1;
        } else if (i[10] <= -1.093977) {
            p = 1;
        } else if (i[10] > -1.093977) {
            p = 2;
        }
        return p;
    }
    static double N9773ef6952(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 78.411579) {
            p = 2;
        } else if (i[0] > 78.411579) {
            p = 0;
        }
        return p;
    }
    static double N4cf0fbd9953(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -1.790744) {
            p = WekaClassifier.N48abe5c6954(i);
        } else if (i[8] > -1.790744) {
            p = WekaClassifier.N1f3b4a2a958(i);
        }
        return p;
    }
    static double N48abe5c6954(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 2;
        } else if (i[11] <= -1.104506) {
            p = WekaClassifier.N73fc1eb8955(i);
        } else if (i[11] > -1.104506) {
            p = WekaClassifier.N43cc0ebf956(i);
        }
        return p;
    }
    static double N73fc1eb8955(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 0;
        } else if (i[7] <= -0.412432) {
            p = 0;
        } else if (i[7] > -0.412432) {
            p = 2;
        }
        return p;
    }
    static double N43cc0ebf956(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 3;
        } else if (i[2] <= -0.084543) {
            p = 3;
        } else if (i[2] > -0.084543) {
            p = WekaClassifier.N8a91b2c957(i);
        }
        return p;
    }
    static double N8a91b2c957(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 8.437395) {
            p = 0;
        } else if (i[1] > 8.437395) {
            p = 3;
        }
        return p;
    }
    static double N1f3b4a2a958(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= -4.207519) {
            p = WekaClassifier.Nc219eab959(i);
        } else if (i[3] > -4.207519) {
            p = WekaClassifier.N2af0a42e963(i);
        }
        return p;
    }
    static double Nc219eab959(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= -0.150903) {
            p = WekaClassifier.N2fbbd066960(i);
        } else if (i[4] > -0.150903) {
            p = 2;
        }
        return p;
    }
    static double N2fbbd066960(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 0;
        } else if (i[0] <= 93.648828) {
            p = WekaClassifier.N6f8bdec6961(i);
        } else if (i[0] > 93.648828) {
            p = 1;
        }
        return p;
    }
    static double N6f8bdec6961(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 0;
        } else if (i[2] <= -0.178962) {
            p = 0;
        } else if (i[2] > -0.178962) {
            p = WekaClassifier.N2a24a307962(i);
        }
        return p;
    }
    static double N2a24a307962(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 7.201287) {
            p = 0;
        } else if (i[1] > 7.201287) {
            p = 3;
        }
        return p;
    }
    static double N2af0a42e963(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 1;
        } else if (i[12] <= -1.31787) {
            p = WekaClassifier.N5b3969f6964(i);
        } else if (i[12] > -1.31787) {
            p = WekaClassifier.N6a75f1b9965(i);
        }
        return p;
    }
    static double N5b3969f6964(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 1;
        } else if (i[7] <= 0.966456) {
            p = 1;
        } else if (i[7] > 0.966456) {
            p = 0;
        }
        return p;
    }
    static double N6a75f1b9965(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= -1.215925) {
            p = WekaClassifier.N65c65b6b966(i);
        } else if (i[3] > -1.215925) {
            p = WekaClassifier.N6b48755b973(i);
        }
        return p;
    }
    static double N65c65b6b966(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= 3.071335) {
            p = WekaClassifier.N4a384229967(i);
        } else if (i[7] > 3.071335) {
            p = 0;
        }
        return p;
    }
    static double N4a384229967(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 0;
        } else if (i[0] <= 79.064769) {
            p = WekaClassifier.N5adef441968(i);
        } else if (i[0] > 79.064769) {
            p = WekaClassifier.N1fe33e9a969(i);
        }
        return p;
    }
    static double N5adef441968(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 0;
        } else if (i[11] <= -0.233548) {
            p = 0;
        } else if (i[11] > -0.233548) {
            p = 2;
        }
        return p;
    }
    static double N1fe33e9a969(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 2;
        } else if (i[6] <= 0.157019) {
            p = WekaClassifier.N4829330e970(i);
        } else if (i[6] > 0.157019) {
            p = 2;
        }
        return p;
    }
    static double N4829330e970(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 2;
        } else if (i[6] <= -0.151516) {
            p = 2;
        } else if (i[6] > -0.151516) {
            p = WekaClassifier.N40081928971(i);
        }
        return p;
    }
    static double N40081928971(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 1.811881) {
            p = WekaClassifier.N6dd99194972(i);
        } else if (i[2] > 1.811881) {
            p = 2;
        }
        return p;
    }
    static double N6dd99194972(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 1;
        } else if (i[3] <= -2.906534) {
            p = 1;
        } else if (i[3] > -2.906534) {
            p = 3;
        }
        return p;
    }
    static double N6b48755b973(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= 0.828793) {
            p = WekaClassifier.N6af88a7f974(i);
        } else if (i[7] > 0.828793) {
            p = 1;
        }
        return p;
    }
    static double N6af88a7f974(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 2;
        } else if (i[11] <= -0.154501) {
            p = WekaClassifier.N6a391f51975(i);
        } else if (i[11] > -0.154501) {
            p = WekaClassifier.N4d82e551978(i);
        }
        return p;
    }
    static double N6a391f51975(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 90.132654) {
            p = WekaClassifier.N4b4d76b3976(i);
        } else if (i[0] > 90.132654) {
            p = 1;
        }
        return p;
    }
    static double N4b4d76b3976(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 77.080044) {
            p = WekaClassifier.N6387302c977(i);
        } else if (i[0] > 77.080044) {
            p = 2;
        }
        return p;
    }
    static double N6387302c977(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[12])) {
            p = 2;
        } else if (i[12] <= -0.582226) {
            p = 2;
        } else if (i[12] > -0.582226) {
            p = 1;
        }
        return p;
    }
    static double N4d82e551978(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 1;
        } else if (i[1] <= 10.825571) {
            p = WekaClassifier.N6fe3a827979(i);
        } else if (i[1] > 10.825571) {
            p = 2;
        }
        return p;
    }
    static double N6fe3a827979(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= 0.126342) {
            p = WekaClassifier.N4f3bb386980(i);
        } else if (i[6] > 0.126342) {
            p = 1;
        }
        return p;
    }
    static double N4f3bb386980(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 1;
        } else if (i[7] <= -0.788564) {
            p = 1;
        } else if (i[7] > -0.788564) {
            p = 0;
        }
        return p;
    }
    static double N1567ec1d981(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -1.969371) {
            p = WekaClassifier.N4f152b8d982(i);
        } else if (i[8] > -1.969371) {
            p = WekaClassifier.N3dc500d8983(i);
        }
        return p;
    }
    static double N4f152b8d982(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 0;
        } else if (i[11] <= -0.429274) {
            p = 0;
        } else if (i[11] > -0.429274) {
            p = 3;
        }
        return p;
    }
    static double N3dc500d8983(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 0;
        } else if (i[8] <= -0.421754) {
            p = WekaClassifier.N2ff03365984(i);
        } else if (i[8] > -0.421754) {
            p = WekaClassifier.N63f23ff7986(i);
        }
        return p;
    }
    static double N2ff03365984(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -2.894473) {
            p = WekaClassifier.N5dd3582985(i);
        } else if (i[6] > -2.894473) {
            p = 0;
        }
        return p;
    }
    static double N5dd3582985(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= -0.183263) {
            p = 0;
        } else if (i[3] > -0.183263) {
            p = 3;
        }
        return p;
    }
    static double N63f23ff7986(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 2;
        } else if (i[10] <= 0.014786) {
            p = 2;
        } else if (i[10] > 0.014786) {
            p = 0;
        }
        return p;
    }
    static double N76a43091987(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= 0.450678) {
            p = WekaClassifier.N58615e3b988(i);
        } else if (i[9] > 0.450678) {
            p = WekaClassifier.N4d20ff8a994(i);
        }
        return p;
    }
    static double N58615e3b988(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 2;
        } else if (i[4] <= -3.041119) {
            p = 2;
        } else if (i[4] > -3.041119) {
            p = WekaClassifier.N34fc0190989(i);
        }
        return p;
    }
    static double N34fc0190989(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= 0.842559) {
            p = WekaClassifier.N46039d7f990(i);
        } else if (i[3] > 0.842559) {
            p = 1;
        }
        return p;
    }
    static double N46039d7f990(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 1;
        } else if (i[3] <= -4.08784) {
            p = WekaClassifier.N11f40d96991(i);
        } else if (i[3] > -4.08784) {
            p = WekaClassifier.N43360915992(i);
        }
        return p;
    }
    static double N11f40d96991(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 84.659761) {
            p = 2;
        } else if (i[0] > 84.659761) {
            p = 1;
        }
        return p;
    }
    static double N43360915992(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 1;
        } else if (i[1] <= 13.681976) {
            p = WekaClassifier.N17926062993(i);
        } else if (i[1] > 13.681976) {
            p = 0;
        }
        return p;
    }
    static double N17926062993(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= -1.215403) {
            p = 1;
        } else if (i[4] > -1.215403) {
            p = 0;
        }
        return p;
    }
    static double N4d20ff8a994(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 76.956914) {
            p = 2;
        } else if (i[0] > 76.956914) {
            p = 1;
        }
        return p;
    }
    static double N7c89c305995(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 1;
        } else if (i[5] <= 0.716065) {
            p = WekaClassifier.Nf840320996(i);
        } else if (i[5] > 0.716065) {
            p = 0;
        }
        return p;
    }
    static double Nf840320996(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 1;
        } else if (i[0] <= 102.272868) {
            p = WekaClassifier.Nb11f3c2997(i);
        } else if (i[0] > 102.272868) {
            p = 0;
        }
        return p;
    }
    static double Nb11f3c2997(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 1;
        } else if (i[7] <= 2.521063) {
            p = 1;
        } else if (i[7] > 2.521063) {
            p = 0;
        }
        return p;
    }
    static double N41079185998(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 0;
        } else if (i[1] <= 9.144695) {
            p = WekaClassifier.N7324e34b999(i);
        } else if (i[1] > 9.144695) {
            p = WekaClassifier.N2a3b99d61012(i);
        }
        return p;
    }
    static double N7324e34b999(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -1.686414) {
            p = WekaClassifier.N5c16630c1000(i);
        } else if (i[6] > -1.686414) {
            p = WekaClassifier.N589d04af1001(i);
        }
        return p;
    }
    static double N5c16630c1000(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 3;
        } else if (i[2] <= 2.88084) {
            p = 3;
        } else if (i[2] > 2.88084) {
            p = 0;
        }
        return p;
    }
    static double N589d04af1001(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 0;
        } else if (i[3] <= 1.121926) {
            p = WekaClassifier.N256b3d801002(i);
        } else if (i[3] > 1.121926) {
            p = 1;
        }
        return p;
    }
    static double N256b3d801002(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 2;
        } else if (i[4] <= 1.965161) {
            p = WekaClassifier.N7181bcdd1003(i);
        } else if (i[4] > 1.965161) {
            p = WekaClassifier.N7d3ecfa01011(i);
        }
        return p;
    }
    static double N7181bcdd1003(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -3.189753) {
            p = 3;
        } else if (i[8] > -3.189753) {
            p = WekaClassifier.N1e60afe21004(i);
        }
        return p;
    }
    static double N1e60afe21004(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -0.992457) {
            p = WekaClassifier.N2e6868fd1005(i);
        } else if (i[5] > -0.992457) {
            p = WekaClassifier.N5293c78d1006(i);
        }
        return p;
    }
    static double N2e6868fd1005(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 2;
        } else if (i[10] <= 0.240424) {
            p = 2;
        } else if (i[10] > 0.240424) {
            p = 3;
        }
        return p;
    }
    static double N5293c78d1006(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 2;
        } else if (i[6] <= -1.189687) {
            p = 2;
        } else if (i[6] > -1.189687) {
            p = WekaClassifier.N2e08ee561007(i);
        }
        return p;
    }
    static double N2e08ee561007(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 0;
        } else if (i[6] <= 2.155522) {
            p = WekaClassifier.N350c4bca1008(i);
        } else if (i[6] > 2.155522) {
            p = 2;
        }
        return p;
    }
    static double N350c4bca1008(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 2;
        } else if (i[7] <= -0.770112) {
            p = 2;
        } else if (i[7] > -0.770112) {
            p = WekaClassifier.N58cee2161009(i);
        }
        return p;
    }
    static double N58cee2161009(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 0;
        } else if (i[5] <= 1.081645) {
            p = 0;
        } else if (i[5] > 1.081645) {
            p = WekaClassifier.N142df92d1010(i);
        }
        return p;
    }
    static double N142df92d1010(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 0;
        } else if (i[4] <= 0.497794) {
            p = 0;
        } else if (i[4] > 0.497794) {
            p = 3;
        }
        return p;
    }
    static double N7d3ecfa01011(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 0;
        } else if (i[9] <= 0.928498) {
            p = 0;
        } else if (i[9] > 0.928498) {
            p = 2;
        }
        return p;
    }
    static double N2a3b99d61012(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= 1.297926) {
            p = WekaClassifier.N54a00d51013(i);
        } else if (i[5] > 1.297926) {
            p = WekaClassifier.N6bd0f46a1020(i);
        }
        return p;
    }
    static double N54a00d51013(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 2;
        } else if (i[1] <= 14.134323) {
            p = WekaClassifier.N7e5575c01014(i);
        } else if (i[1] > 14.134323) {
            p = 0;
        }
        return p;
    }
    static double N7e5575c01014(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[0])) {
            p = 2;
        } else if (i[0] <= 92.393656) {
            p = WekaClassifier.N751de6651015(i);
        } else if (i[0] > 92.393656) {
            p = 3;
        }
        return p;
    }
    static double N751de6651015(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[9])) {
            p = 2;
        } else if (i[9] <= 0.374247) {
            p = WekaClassifier.N39e24391016(i);
        } else if (i[9] > 0.374247) {
            p = 2;
        }
        return p;
    }
    static double N39e24391016(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 2;
        } else if (i[6] <= 0.150466) {
            p = WekaClassifier.N5687d0371017(i);
        } else if (i[6] > 0.150466) {
            p = 2;
        }
        return p;
    }
    static double N5687d0371017(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[11])) {
            p = 2;
        } else if (i[11] <= 0.363895) {
            p = WekaClassifier.N32944521018(i);
        } else if (i[11] > 0.363895) {
            p = 0;
        }
        return p;
    }
    static double N32944521018(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 0;
        } else if (i[8] <= -1.07238) {
            p = WekaClassifier.N191db49c1019(i);
        } else if (i[8] > -1.07238) {
            p = 2;
        }
        return p;
    }
    static double N191db49c1019(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 2;
        } else if (i[5] <= -0.6449) {
            p = 2;
        } else if (i[5] > -0.6449) {
            p = 0;
        }
        return p;
    }
    static double N6bd0f46a1020(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 0;
        } else if (i[8] <= -0.767393) {
            p = 0;
        } else if (i[8] > -0.767393) {
            p = 2;
        }
        return p;
    }
    static double N33e874f1021(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[2])) {
            p = 1;
        } else if (i[2] <= 5.165667) {
            p = WekaClassifier.N4afc58ae1022(i);
        } else if (i[2] > 5.165667) {
            p = WekaClassifier.N563b0c9c1029(i);
        }
        return p;
    }
    static double N4afc58ae1022(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 6.55255) {
            p = 3;
        } else if (i[1] > 6.55255) {
            p = WekaClassifier.N3e31ac391023(i);
        }
        return p;
    }
    static double N3e31ac391023(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[7])) {
            p = 1;
        } else if (i[7] <= 0.282893) {
            p = WekaClassifier.N522e6c311024(i);
        } else if (i[7] > 0.282893) {
            p = 1;
        }
        return p;
    }
    static double N522e6c311024(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[4])) {
            p = 1;
        } else if (i[4] <= 0.589115) {
            p = WekaClassifier.N25dd8dc41025(i);
        } else if (i[4] > 0.589115) {
            p = 3;
        }
        return p;
    }
    static double N25dd8dc41025(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -1.257708) {
            p = WekaClassifier.Ndcc98f91026(i);
        } else if (i[8] > -1.257708) {
            p = WekaClassifier.N1f41011d1028(i);
        }
        return p;
    }
    static double Ndcc98f91026(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[10])) {
            p = 3;
        } else if (i[10] <= -0.142716) {
            p = 3;
        } else if (i[10] > -0.142716) {
            p = WekaClassifier.N3eafad1d1027(i);
        }
        return p;
    }
    static double N3eafad1d1027(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[5])) {
            p = 3;
        } else if (i[5] <= -2.941986) {
            p = 3;
        } else if (i[5] > -2.941986) {
            p = 1;
        }
        return p;
    }
    static double N1f41011d1028(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[1])) {
            p = 3;
        } else if (i[1] <= 7.480396) {
            p = 3;
        } else if (i[1] > 7.480396) {
            p = 1;
        }
        return p;
    }
    static double N563b0c9c1029(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= 0.374606) {
            p = WekaClassifier.N3f595df21030(i);
        } else if (i[6] > 0.374606) {
            p = 0;
        }
        return p;
    }
    static double N3f595df21030(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[8])) {
            p = 3;
        } else if (i[8] <= -0.067676) {
            p = WekaClassifier.N7cddd8411031(i);
        } else if (i[8] > -0.067676) {
            p = 0;
        }
        return p;
    }
    static double N7cddd8411031(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[3])) {
            p = 2;
        } else if (i[3] <= 2.088678) {
            p = WekaClassifier.N6b03772e1032(i);
        } else if (i[3] > 2.088678) {
            p = 3;
        }
        return p;
    }
    static double N6b03772e1032(double []i) {
        double p = Double.NaN;
        if (Double.isNaN(i[6])) {
            p = 3;
        } else if (i[6] <= -1.598408) {
            p = 3;
        } else if (i[6] > -1.598408) {
            p = 2;
        }
        return p;
    }
}
