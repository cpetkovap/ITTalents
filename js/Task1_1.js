var arr = [3, 'a', 'a', 'a', 2, 3, 'a', 3, 'a', 2, 4, 9, 3, 'a'];
function mostReturnSymbol(a){
	if(a.length == 0){
		return;
	}
	var count = {};
	var maxElement = a[0];
	var maxCount = 0;
	for(var i = 0; i < a.length; i++){
	var element = a[i];
		if(count[element] == null){
			count[element] = 1;
		}else{
			count[element]++;
		}
		if(count[element] > maxCount){
			maxElement = element;
			maxCount = count[element];
		}
	}
	
	document.write(maxElement + " ( " + maxCount + " times ) ");
}
mostReturnSymbol(arr);

