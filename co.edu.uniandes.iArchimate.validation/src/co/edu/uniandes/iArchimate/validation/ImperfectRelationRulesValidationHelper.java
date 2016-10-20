package co.edu.uniandes.iArchimate.validation;

import iArchimate.AbsentElement;
import iArchimate.ImperfectRelation;

public class ImperfectRelationRulesValidationHelper {

	public int isInstanceCertaintyDegree(ImperfectRelation instance) {
		if(instance.getCertaintyDegree()==0){
			return 1;
		}else if(instance.getTarget() instanceof AbsentElement){
			return 2;
		}else{
			return 0;
		}
	}

	public int isInstanceSet(ImperfectRelation instance) {
		if(instance.getCertaintyDegree()!=0){
			return 1;
		}else if(instance.getTarget() instanceof AbsentElement){
			return 2;
		}else{
			return 0;
		}
	}

	public int isAbsentInstance(ImperfectRelation instance) {
		if(!(instance.getTarget() instanceof AbsentElement)){
			return 1;
		}else if(instance.getCertaintyDegree()!=0){
			return 2;
		}else{
			return 0;
		}
	}


}
