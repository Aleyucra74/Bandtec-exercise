import time
pontos = set()
mediax = 0.0
mediay = 0.0
somax = 0
somay = 0
while True:
    print("-"*30)
    dado = int(input("insira o numero de pontos de dados:"))
    for i in range(dado):
        x = float(input("x"+str(i+1)+": "))
        y = float(input("y"+str(i+1)+": "))
        pontos.add((x,y))

    for i in pontos:
        mediax += i[0]/len(pontos)
        mediay += i[1]/len(pontos)

    for i in pontos:
        somax += (i[0]-mediax)**2
        somay += (i[0]-mediax)*(i[1]-mediay)
    
    declinio = somax/somay
    inter = mediay-declinio*mediax

    print("linha de melhor ajuste")
    print(f"y = {declinio}x + {inter}")

    x = float(input("insira um valor para calcular: "))
    print(f"y = {declinio*x+inter}")