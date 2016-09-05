/*
Copyright (C) 2016 Syracuse University

This file is part of the Spectrum Consumption Model Builder and
Analysis Tool

This program is free software; you can redistribute it and/or modify it
under the terms of the GNU General Public License as published by the
Free Software Foundation; either version 3 of the License, or (at your
option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License
along with program.  If not, see <http://www.gnu.org/licenses/>.

*/

/**
* PrintRxText.java
* Outputs receiver data in text format for Octave functions to process it
*/

package Execute;

import java.io.PrintWriter;
import java.util.List;

import org.ieee.dyspansc._1900._5.scm.BTPRatedListType;
import org.ieee.dyspansc._1900._5.scm.BTPRatingType;
import org.ieee.dyspansc._1900._5.scm.BWRatedListType;
import org.ieee.dyspansc._1900._5.scm.BWRatingType;
import org.ieee.dyspansc._1900._5.scm.DCRatedListType;
import org.ieee.dyspansc._1900._5.scm.DCRatingType;
import org.ieee.dyspansc._1900._5.scm.InflectionPointType;
import org.ieee.dyspansc._1900._5.scm.RatingType;
import org.ieee.dyspansc._1900._5.scm.RxModelType;

public class PrintRxText extends PrintText{

	public void printText(RxModelType model, String SaveName){
		
		PrintWriter printfile;
		try{
			System.out.println("Rx Printing");
			printfile = new PrintWriter ("Octave/" + SaveName);
			int o=0;
			
			if(model.getUnderlayMask().get(o)!=null){
				System.out.println("Underlay Mask Printing");
				
				printfile.println("# name: Rx_UnderlayMask");
				printfile.println("# type: matrix");
				printfile.println("# rows: 1");
				List<InflectionPointType> infPoint = model.getUnderlayMask()
						.get(o).getScmMask().getInflectionPoint();
				String data = "";
				for(int i=0; i<infPoint.size(); i++){
					data = data + infPoint.get(i).getFrequency() + " ";
					data = data + infPoint.get(i).getRelativePower() + " ";
				}
				printfile.println("# columns: " + infPoint.size()*2);
			    printfile.println(data);
			    printfile.println("");
				printfile.println("");
				
				printfile.println("# name: Rx_ResBW");
				printfile.println("# type: scalar");
				if(!String.valueOf(model.getUnderlayMask().get(o).getResolutionBW()).equals(null)){
				    printfile.println (model.getUnderlayMask().get(o).getResolutionBW());
				}
			    printfile.println("");
				printfile.println("");
				
				if(model.getUnderlayMask().get(o).getRating()!=null){
				
					RatingType ratedMask = model.getUnderlayMask().get(o).getRating();
					
					if(ratedMask.getRatedBW()!=0.0){
						
						printfile.println("# name: Rx_BWRatedList");
						printfile.println("# type: matrix");
						printfile.println("# rows: 1");				
						printfile.println("# columns: " + 2);
					    printfile.println(ratedMask.getRatedBW() + " "+ 0.0);
					    printfile.println("");
						printfile.println("");
					}
					
					if(ratedMask.getBwRatedList()!=null){
						BWRatedListType bwRatedList = ratedMask.getBwRatedList();
						List<BWRatingType> bwRating = bwRatedList.getBwRating();
						String bwData = "";
						
						for(int i=0; i<bwRating.size(); i++){
							String data1 = String.valueOf(bwRating.get(i).getRatedBW());		
							String data2 = String.valueOf(bwRating.get(i).getAdjustment());
							bwData = bwData + data1 + " " + data2 + " ";
						}
						
						printfile.println("# name: Rx_BWRatedList");
						printfile.println("# type: matrix");
						printfile.println("# rows: 1");				
						printfile.println("# columns: " + bwRating.size()*2);
					    printfile.println(bwData);
					    printfile.println("");
						printfile.println("");
					}
					
					if(ratedMask.getRatedBTP()!=0.0){
					
						printfile.println("# name: Rx_BTPRatedList");
						printfile.println("# type: matrix");
						printfile.println("# rows: 1");				
						printfile.println("# columns: " + 2);
					    printfile.println(ratedMask.getRatedBTP() +" "+0.0);
					    printfile.println("");
						printfile.println("");
					}
					
					if(ratedMask.getBtpRatedList()!=null){
						BTPRatedListType btpRatedList = ratedMask.getBtpRatedList();
						List<BTPRatingType> btpRating = btpRatedList.getBtpRating();
						String btpData = "";
												
						for(int i=0; i<btpRating.size(); i++){
							String data1 = String.valueOf(btpRating.get(i).getBtp());
							String data2 = String.valueOf(btpRating.get(i).getAdjustment());
							btpData = btpData + data1 + " " + data2 + " ";
						}
						
						printfile.println("# name: Rx_BTPRatedList");
						printfile.println("# type: matrix");
						printfile.println("# rows: 1");				
						printfile.println("# columns: " + btpRating.size()*2);
					    printfile.println(btpData);
					    printfile.println("");
						printfile.println("");
					}
					
					if(ratedMask.getDcRatedList()!=null){
						
						DCRatedListType dcRatedList = ratedMask.getDcRatedList();
						List<DCRatingType> dcRating = dcRatedList.getDcRating();
						String dcData = "";
						
						for(int i=0; i<dcRating.size(); i++){
							String data1 = String.valueOf(dcRating.get(i).getDc());
							String data2 = String.valueOf(dcRating.get(i).getMaxDwellTime());
							String data3 = String.valueOf(dcRating.get(i).getAdjustment());
							dcData = dcData + data1 + " " + data2 + " " + data3 + " ";
						}
						
						printfile.println("# name: Rx_DutyList");
						printfile.println("# type: matrix");
						printfile.println("# rows: 1");				
						printfile.println("# columns: " + dcRating.size()*3);
					    printfile.println(dcData);
					    printfile.println("");
						printfile.println("");
						
					}
					
					if(ratedMask.getPorpIndex()!=0){
						printfile.println("# name: Rx_Policy");
						printfile.println("# type: scalar");
					    printfile.println (ratedMask.getPorpIndex());
					    printfile.println("");
						printfile.println("");
					}
					
					
				}
				
			}			
			
			printReferencePower(model.getReferencePower().get(o), printfile, "Rx");
			printPowerMap(model.getScmPowerMap().get(o),printfile,"Rx");
			printLocation(model.getScmLocation().get(o),printfile,"Rx");
			printTime(model.getScmSchedule().get(o),printfile,"Rx");
			
			printfile.close();
		}catch(Exception e){
			new Warn().setWarn("Error", "Couldn't save the Receiver data correctly");
		}
		
	}
}

