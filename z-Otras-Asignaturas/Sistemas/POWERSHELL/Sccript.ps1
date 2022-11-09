$array = @(14,25,80,33,7,28,56,70,91,88)

Write-Host "los mayores de 50"
Write-Host "-----------------"

for($i=0;$i -lt $array.Count;$i++ ) {
    if($array[$i] -gt 50) {
        Write-Host $array[$i]

    }
}

Write-Host "Cuantos pares hay"
Write-Host "-----------------"

$contador = 0
for($i=0;$i -lt $array.Count;$i++ ) {
    if($array[$i]%2 -eq 0) {
       $contador++

    }
}
Write-Host "Hay " $contador


Write-Host "La suma de todos"
Write-Host "----------------"

$suma = 0
for($i=0;$i -lt $array.Count;$i++ ) {
    $suma = $suma + $array[$i]
}
Write-Host "La suma es " $suma

Write-Host "Ordenar array"
Write-Host "--------------"

$array | Sort-Object

$pares = @()
$impares = @()

forearch($array in $item) {
    if($item%2 -eq 0) {
       $pares+=$item
        
    }
    else{
        $impares+=$item
    }
}

Write-Host "Ordenar array"
Write-Host "--------------"