package co.edu.uniandes.iArchimate.validation;

public class ImperfectAttributeRulesValidationHelper {

	public boolean isNumericRange(String value){
		if(value.charAt(0)!='[' || value.charAt(value.length()-1)!=']'){
			return false;
		}
		String rangeValues = value.substring(1,value.length()-1);
		String [] numericValues = rangeValues.split("-");
		if(numericValues.length==2){
			try {
				double min = Double.parseDouble(numericValues[0].trim());
				double max = Double.parseDouble(numericValues[1].trim());
				if(min>=max){
					return false;
				}
			} catch (Exception e) {
				return false;
			}
		}else{
			return false;
		}
		return true;
	}

	@SuppressWarnings("unused")
	public boolean isNumericSet(String value) {
		if(value.charAt(0)!='(' || value.charAt(value.length()-1)!=')'){
			return false;
		}
		String values = value.substring(1,value.length()-1);
		String [] setValues = values.split(",");
		if(setValues.length>=2){
			for(int i=0; i<setValues.length; i++){
				try {
					double numValue = Double.parseDouble(setValues[i].trim());
				} catch (Exception e) {
					return false;
				}			
			}					
		}else{
			return false;
		}
		return true;
	}

	public boolean isStringSet(String value) {
		if(value.charAt(0)!='(' || value.charAt(value.length()-1)!=')'){
			return false;
		}
		String values = value.substring(1,value.length()-1);
		String [] setValues = values.split(",");
		if(setValues.length<2){
			return false;
		}
		return true;
	}

	@SuppressWarnings("unused")
	public boolean isNumericValueCertaintyDegree(String value) {
		if(value.charAt(0)!='{' || value.charAt(value.length()-1)!='}'){
			return false;
		}
		String values = value.substring(1,value.length()-1);
		String [] valueAndDegree = values.split(",");
		if(valueAndDegree.length==2){
			try {
				double val = Double.parseDouble(valueAndDegree[0].trim());
				valueAndDegree[1]=valueAndDegree[1].trim();
				if(valueAndDegree[1].charAt(valueAndDegree[1].length()-1)=='%'){
					double degree = Double.parseDouble(valueAndDegree[1].substring(0,valueAndDegree[1].length()-1));	
				}else{
					return false;
				}
			} catch (Exception e) {
				return false;
			}
		}else{
			return false;
		}
		return true;
	}

	@SuppressWarnings("unused")
	public boolean isStringValueCertaintyDegree(String value) {
		if(value.charAt(0)!='{' || value.charAt(value.length()-1)!='}'){
			return false;
		}
		String values = value.substring(1,value.length()-1);
		String [] valueAndDegree = values.split(",");
		if(valueAndDegree.length==2){
			try {
				valueAndDegree[1]=valueAndDegree[1].trim();
				if(valueAndDegree[1].charAt(valueAndDegree[1].length()-1)=='%'){
					double degree = Double.parseDouble(valueAndDegree[1].substring(0,valueAndDegree[1].length()-1));	
				}else{
					return false;
				}
			} catch (Exception e) {
				return false;
			}
		}else{
			return false;
		}
		return true;
	}

	public boolean isLinguisticValue(String value) {
		if(value.charAt(0)!='<' || value.charAt(value.length()-1)!='>'){
			return false;
		}else{			
			return true;
		}
	}

	public boolean isNoValue(String value) {
		if(value.equals("?")){
			return true;
		}else{
			return false;
		}
	}	
	
	@SuppressWarnings("unused")
	public String correctNumericRange(String value){
		if(value.charAt(0)!='['){
			try {
				int number = Integer.parseInt(value.substring(0));
				value="["+value;
			} catch (Exception e) {
				value="["+value.substring(1);
			}		
		}
		if(value.charAt(value.length()-1)!=']'){
			try {
				int number = Integer.parseInt(value.substring(value.length()-1));
				value=value+"]";
			} catch (Exception e) {
				value=value.substring(0,value.length()-1)+"]";
			}		
		}
		String rangeValues = value.substring(1,value.length()-1);
		String [] numericValues = rangeValues.split(",");
		if(numericValues.length==2){
			try {
				double min = Double.parseDouble(numericValues[0].trim());
				double max = Double.parseDouble(numericValues[1].trim());
				if(min>=max){
					int newMin;
					int newMax;
					if(min%1==0 || max%1==0){
						newMin = (int)min;
						newMax = (int)max;
						value="["+newMax+","+newMin+"]";
					}else{
						value="["+max+","+min+"]";						
					}
				}
			} catch (Exception e) {
			}
		}else{
			value="["+numericValues[0]+","+numericValues[1]+"]";
		}
		return value;
	}	

	@SuppressWarnings("unused")
	public String correctNumericSet(String value){
		if(value.charAt(0)!='('){
			try {
				int number = Integer.parseInt(value.substring(0));
				value="("+value;
			} catch (Exception e) {
				value="("+value.substring(1);
			}		
		}
		if(value.charAt(value.length()-1)!=')'){
			try {
				int number = Integer.parseInt(value.substring(value.length()-1));
				value=value+")";
			} catch (Exception e) {
				value=value.substring(0,value.length()-1)+")";
			}		
		}
		return value;
	}	

	public String correctNumericValueCertaintyDegree(String value){
		if(value.charAt(0)!='{'){
			value="{"+value;
		}
		if(value.charAt(value.length()-1)!='}'){
			value=value+"}";
		}
		String values = value.substring(1,value.length()-1);
		String [] valueAndDegree = values.split(",");
		if(valueAndDegree.length==2){
			try {
				valueAndDegree[1]=valueAndDegree[1].trim();
				if(valueAndDegree[1].charAt(valueAndDegree[1].length()-1)!='%'){
					value=value.substring(0,value.length()-2)+"%}";					
				}
			} catch (Exception e) {
				return value;
			}
			double degree = Double.parseDouble(valueAndDegree[1].substring(0,valueAndDegree[1].length()-1));
			if(degree<0){
				value="{"+valueAndDegree[0]+",0%}";
			}else if(degree>100){
				value="{"+valueAndDegree[0]+",100%}";
			}		
		}else{
			value="{"+valueAndDegree[0]+","+valueAndDegree[1]+"%}";
		}
		return value;
	}	

	public String correctStringValueCertaintyDegree(String value){
		if(value.charAt(0)!='{'){
			value="{"+value;
		}
		if(value.charAt(value.length()-1)!='}'){
			value=value+"}";
		}
		String values = value.substring(1,value.length()-1);
		String [] valueAndDegree = values.split(",");
		if(valueAndDegree.length==2){
			try {
				valueAndDegree[1]=valueAndDegree[1].trim();
				if(valueAndDegree[1].charAt(valueAndDegree[1].length()-1)!='%'){
					value=value.substring(0,value.length()-2)+"%}";					
				}
			} catch (Exception e) {
				return value;
			}
			double degree = Double.parseDouble(valueAndDegree[1].substring(0,valueAndDegree[1].length()-1));
			if(degree<0){
				value="{"+valueAndDegree[0]+",0%}";
			}else if(degree>100){
				value="{"+valueAndDegree[0]+",100%}";
			}		
		}else{
			value="{"+valueAndDegree[0]+","+valueAndDegree[1]+"%}";
		}
		return value;
	}	
	
	public String correctLinguisticValue(String value){
		if(value.charAt(0)!='<'){
			if(value.charAt(0)!='('||value.charAt(0)!='['||value.charAt(0)!='{'){
				value="<"+value.substring(1);
			}else{
				value="<"+value;				
			}
		}
		if(value.charAt(value.length()-1)!='>'){
			if(value.charAt(value.length()-1)!=')'||value.charAt(value.length()-1)!=']'||value.charAt(value.length()-1)!='}'){
				value=value.substring(0,value.length()-1)+">";
			}else{
				value=value+">";
			}
		}
		return value;
	}

}
