def Esmultiplo (num1, num2):
    multiplo= False
    if num1 % num2 == 0:
        multiplo = True
    return multiplo

numfuncion = Esmultiplo (int (input ("introducir un numero:")), int (input ("introducir un numero:")))
print (numfuncion)