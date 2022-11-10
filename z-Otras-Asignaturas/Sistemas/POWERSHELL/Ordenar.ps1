$array = @(28,11,42,63,81,95,6,74)
$array1 = @()
$elemento = 70

for($x=1;$x -lt $array.Count;$x++ ) {
    for($a=0;$a -lt $array.Count-1;$a++) {
        if($array[$a] -gt $array[$a+1]) {
            $temp = $array[$a]
            $array[$a] = $array[$a+1]
            $array[$a+1] = $temp

        }
     }                                     
}

 
for($j=0;$j -lt $array.Count;$j++) {
   
    $celda = $array[$j]
    $insertado = 0
    if($elemento -lt $array[$j] -and ($insertado == 0)) {
        $celda = $elemento;
        $insertado =  1
    } 
    
 
    $array1 += $celda
    
   
          
    
}

 
for($x=0;$x -lt $array1.Count;$x++ ) {
    Write-Host $array1[$x]
}







        
    
