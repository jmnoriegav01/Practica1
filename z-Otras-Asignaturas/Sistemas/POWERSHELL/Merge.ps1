$array1 = @(28,11,42,63,81,95,6,74)
$array2 = @(21,34,45,70,1,10,8,14,20)
$array3 = @()

for($x=0;$x -lt $array1.Count;$x++ ) {
     $array3+=$array1[$x]                             
}

for($x=0;$x -lt $array2.Count;$x++ ) {
     $array3+=$array2[$x]                             
}


for($x=1;$x -lt $array3.Count;$x++ ) {
    for($a=0;$a -lt $array3.Count-1;$a++) {
        if($array3[$a] -gt $array3[$a+1]) {
            $temp = $array3[$a]
            $array3[$a] = $array3[$a+1]
            $array3[$a+1] = $temp

        }
     }                                     
}

foreach($celda in $array3){
    Write-Host $celda
}