package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Locations {
    public static void location(String origin, String destination) {
        Map<String, ArrayList<Double>> ports = new HashMap<>();

        ArrayList<Double> cAK = new ArrayList<Double>(); //Kotlik Airport
        cAK.add(63.035789);
        cAK.add(-163.527863);
        ports.put("AK", cAK);

        ArrayList<Double> cAL = new ArrayList<Double>(); //Northwest Alabama Regional Airport
        cAL.add(34.74528);
        cAL.add(-87.61028);
        ports.put("AL", cAL);

        ArrayList<Double> cAR = new ArrayList<Double>(); //Tucson International Airport
        cAR.add(32.116112);
        cAR.add(-110.941109);
        ports.put("AR", cAR);

        ArrayList<Double> cAZ = new ArrayList<Double>(); //Falcon Field Airport
        cAZ.add(33.457439);
        cAZ.add(-111.727386);
        ports.put("AZ", cAZ);

        ArrayList<Double> cCA = new ArrayList<Double>(); //San Diego International Airport
        cCA.add(32.731770);
        cCA.add(-117.197624);
        ports.put("CA", cCA);

        ArrayList<Double> cCO = new ArrayList<Double>(); //Denver International Airport
        cCO.add(39.849312);
        cCO.add(-104.673828);
        ports.put("CO", cCO);

        ArrayList<Double> cCT = new ArrayList<Double>(); //Bradley International Airport
        cCT.add(41.938888);
        cCT.add(-72.683333);
        ports.put("CT", cCT);

        ArrayList<Double> cDE = new ArrayList<Double>(); //Delaware Municipal Airport
        cDE.add(40.279542);
        cDE.add(-83.113383);
        ports.put("DE", cDE);

        ArrayList<Double> cFL = new ArrayList<Double>(); //Tampa International Airport
        cFL.add(27.979168);
        cFL.add(-82.539337);
        ports.put("FL", cFL);

        ArrayList<Double> cGA = new ArrayList<Double>(); //Hartsfield-Jackson Atlanta International Airport
        cGA.add(33.640411);
        cGA.add(-84.419853);
        ports.put("GA", cGA);

        ArrayList<Double> cHI = new ArrayList<Double>(); //Honolulu International Airport
        cHI.add(21.324513);
        cHI.add(-157.925073);
        ports.put("HI", cHI);

        ArrayList<Double> cIA = new ArrayList<Double>(); //The Eastern Iowa Airport
        cIA.add(41.886386);
        cIA.add(-91.706975);
        ports.put("IA", cIA);

        ArrayList<Double> cID = new ArrayList<Double>(); //Pocatello Regional Airport
        cID.add(42.915703);
        cID.add(-112.593040);
        ports.put("ID", cID);

        ArrayList<Double> cIL = new ArrayList<Double>(); //O’Hare International Airport
        cIL.add(41.978611);
        cIL.add(-87.904724);
        ports.put("IL", cIL);

        ArrayList<Double> cIN = new ArrayList<Double>(); //Indianapolis International Airport
        cIN.add(39.716859);
        cIN.add(-86.295595);
        ports.put("IN", cIN);

        ArrayList<Double> cKS = new ArrayList<Double>(); //Kansas City International Airport
        cKS.add(39.300642);
        cKS.add(-94.712593);
        ports.put("KS", cKS);

        ArrayList<Double> cKY = new ArrayList<Double>(); //Cincinnati/Northern Kentucky International Airport
        cKY.add(39.053276);
        cKY.add(-84.663017);
        ports.put("KY", cKY);

        ArrayList<Double> cLA = new ArrayList<Double>(); //Louis Armstrong New Orleans International Airport
        cLA.add(29.9922012);
        cLA.add(-90.2590112);
        ports.put("LA", cLA);

        ArrayList<Double> cMA = new ArrayList<Double>(); //Logan International Airport
        cMA.add(42.366978);
        cMA.add(-71.022362);
        ports.put("MA", cMA);

        ArrayList<Double> cMD = new ArrayList<Double>(); //Baltimore/Washington International Thurgood Marshall Airport
        cMD.add(39.177404);
        cMD.add(-76.668392);
        ports.put("MD", cMD);

        ArrayList<Double> cME = new ArrayList<Double>(); //Bangor International Airport
        cME.add(44.807975);
        cME.add(-68.816683);
        ports.put("ME", cME);

        ArrayList<Double> cMI = new ArrayList<Double>(); //Delta County Airport
        cMI.add(45.719906);
        cMI.add(-87.094070);
        ports.put("MI", cMI);

        ArrayList<Double> cMN = new ArrayList<Double>(); //Minneapolis−Saint Paul International Airport
        cMN.add(44.882763);
        cMN.add(-93.2104);
        ports.put("MN", cMN);

        ArrayList<Double> cMO = new ArrayList<Double>(); //St. Louis International Airport
        cMO.add(38.741650);
        cMO.add(-90.365725);
        ports.put("MO", cMO);

        ArrayList<Double> cMS = new ArrayList<Double>(); //Jackson-Medgar Wiley Evers International Airport
        cMS.add(32.311199);
        cMS.add(-90.075897);
        ports.put("MS", cMS);

        ArrayList<Double> cMT = new ArrayList<Double>(); //Billings Logan International Airport
        cMT.add(45.809068);
        cMT.add(-108.539209);
        ports.put("MT", cMT);

        ArrayList<Double> cNC = new ArrayList<Double>(); //Charlotte Douglas International Airport
        cNC.add(35.213890);
        cNC.add(-80.943054);
        ports.put("NC", cNC);

        ArrayList<Double> cND = new ArrayList<Double>(); //Hector International Airport
        cND.add(46.918147);
        cND.add(-96.818304);
        ports.put("ND", cND);

        ArrayList<Double> cNE = new ArrayList<Double>(); //Lincoln Airport
        cNE.add(40.847019);
        cNE.add(-96.755086);
        ports.put("ND", cNE);

        ArrayList<Double> cNH = new ArrayList<Double>(); //Nashua Airport
        cNH.add(42.780342);
        cNH.add(-71.518429);
        ports.put("NH", cNH);

        ArrayList<Double> cNJ = new ArrayList<Double>(); //Naec Airport
        cNJ.add(40.032608);
        cNJ.add(-74.338257);
        ports.put("NJ", cNJ);

        ArrayList<Double> cNM = new ArrayList<Double>(); //Santa Fe Municipal Airport
        cNM.add(35.617500);
        cNM.add(-106.088333);
        ports.put("NM", cNM);

        ArrayList<Double> cNV = new ArrayList<Double>(); //McCarran International Airport
        cNV.add(36.086010);
        cNV.add(-115.153969);
        ports.put("NV", cNV);

        ArrayList<Double> cNY = new ArrayList<Double>(); //John F. Kennedy International Airport
        cNY.add(40.641766);
        cNY.add(-73.780968);
        ports.put("NY", cNY);

        ArrayList<Double> cOH = new ArrayList<Double>(); //Wright-Patterson Air Force Base
        cOH.add(39.819527);
        cOH.add(-84.067406);
        ports.put("OH", cOH);

        ArrayList<Double> cOK = new ArrayList<Double>(); //Hatbox Field Airport
        cOK.add(35.748463);
        cOK.add(-95.412529);
        ports.put("OK", cOK);

        ArrayList<Double> cOR = new ArrayList<Double>(); //Portland International Airport
        cOR.add(45.589769);
        cOR.add(-122.595094);
        ports.put("OR", cOR);

        ArrayList<Double> cPA = new ArrayList<Double>(); //Philadelphia International Airport
        cPA.add(39.874395);
        cPA.add(-75.242422);
        ports.put("PA", cPA);

        ArrayList<Double> cRI = new ArrayList<Double>(); //T. F. Green Airport
        cRI.add(41.724527);
        cRI.add(-71.430406);
        ports.put("RI", cRI);

        ArrayList<Double> cSD = new ArrayList<Double>(); //Sioux Falls Regional Airport
        cSD.add(43.580268);
        cSD.add(-96.731188);
        ports.put("SD", cSD);

        ArrayList<Double> cTN = new ArrayList<Double>(); //Nashville International Airport
        cTN.add(36.131687);
        cTN.add(-86.668823);
        ports.put("TN", cTN);

        ArrayList<Double> cTX = new ArrayList<Double>(); //Austin-Bergstrom International Airport
        cTX.add(30.197429);
        cTX.add(-97.666305);
        ports.put("TX", cTX);

        ArrayList<Double> cUT = new ArrayList<Double>(); //St George Municipal Airport
        cUT.add(37.030792);
        cUT.add(-113.508987);
        ports.put("UT", cUT);

        ArrayList<Double> cVA = new ArrayList<Double>(); //Warrenton-Fauquier Airport
        cVA.add(38.592724);
        cVA.add(-77.711441);
        ports.put("VA", cVA);

        ArrayList<Double> cVT = new ArrayList<Double>(); //Northern Lights Airport
        cVT.add(44.871201);
        cVT.add(-73.286491);
        ports.put("VT", cVT);

        ArrayList<Double> cWA = new ArrayList<Double>(); //Seattle-Tacoma International Airport
        cWA.add(47.443546);
        cWA.add(-122.301659);
        ports.put("WA", cWA);

        ArrayList<Double> cWI = new ArrayList<Double>(); //General Mitchell International Airport
        cWI.add(42.949890);
        cWI.add(-87.900414);
        ports.put("WI", cWI);

        ArrayList<Double> cWV = new ArrayList<Double>(); //North Central West Virginia Airport
        cWV.add(39.297250);
        cWV.add(-80.228672);
        ports.put("WV", cWV);

        ArrayList<Double> cWY = new ArrayList<Double>(); //Jackson Hole Airport
        cWY.add(43.606944);
        cWY.add(-110.737777);
        ports.put("WY", cWY);

        ArrayList<Double> orig = ports.get(origin);
        ArrayList<Double> dest = ports.get(destination);
        Distance calculator = new Distance();
        Double distance = calculator.kmeters(orig.get(0), orig.get(1), dest.get(0), dest.get(1));
        System.out.println(distance);
    }
}
