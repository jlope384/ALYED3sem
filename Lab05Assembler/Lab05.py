def binarioIE74_a_decimal(numero_binario_xd):
    numero_binario_xd = str(numero_binario_xd)
    bit_signo = numero_binario_xd[0]
    bit_exponente = numero_binario_xd[1:9]
    bit_fraccion = numero_binario_xd[9:]
    if bit_signo == "1":
        bit_signo = -1
    else:
        bit_signo = 1
    exponente = 0
    for i in range(8):
        if bit_exponente[i] == "1":
            exponente += 2**(7-i)
    exponente -= 127
    fraccion = 1
    for i in range(23):
        if bit_fraccion[i] == "1":
            fraccion += 2**(-1-i)
    return bit_signo*fraccion*2**exponente

def decimal_a_binarioIE74(numero_decimal_xd):
    numero_decimal_xd = float(numero_decimal_xd)
    bit_signo = "0"
    if numero_decimal_xd < 0:
        bit_signo = "1"
        numero_decimal_xd *= -1
    exponente = 0
    while numero_decimal_xd >= 2:
        exponente += 1
        numero_decimal_xd /= 2
    while numero_decimal_xd < 1:
        exponente -= 1
        numero_decimal_xd *= 2
    exponente += 127
    bit_exponente = ""
    for i in range(8):
        if exponente >= 2**(7-i):
            bit_exponente += "1"
            exponente -= 2**(7-i)
        else:
            bit_exponente += "0"
    fraccion = ""
    numero_decimal_xd -= 1
    for i in range(23):
        if numero_decimal_xd >= 2**(-1-i):
            fraccion += "1"
            numero_decimal_xd -= 2**(-1-i)
        else:
            fraccion += "0"
    return bit_signo + bit_exponente + fraccion
