import random
import time

while True:
	print("*"*30)
	print("** um questionario simples de matematica **")
	print("1. adicao")
	print("2. subtracao")
	print("3. multiplicacao")
	print("4. divisao inteiro")
	print("5. sair")
	print("-"*30)

	escolha = input("digite sua escolha:")

	if escolha == "1":
		valora = random.randint(0,101)
		valorb = random.randint(0,101)
		result = valora + valorb
		print("Digite sua resposta: ")
		resp = int(input(f"{valora} + {valorb} = "))
		if result == resp:
			print("corrigir.")
			print("."*10)
			print("sua pontuacao e 100%. obrigado")
		else:
			print("voce errou")
	elif escolha == "2":
		valora = random.randint(0,101)
		valorb = random.randint(0,101)
		result = valora - valorb
		print("Digite sua resposta: ")
		resp = int(input(f"{valora} - {valorb} = "))
		if resp == result:
			print("corrigir.")
			print("."*10)
			print("sua pontuacao e 100%. obrigado")
		else:
			print("voce errou")
	elif escolha == "3":
		valora = random.randint(0,101)
		valorb = random.randint(0,101)
		result = valora * valorb
		print("Digite sua resposta: ")
		resp = int(input(f"{valora} * {valorb} = "))
		if resp == result:
			print("corrigir.")
			print("."*10)
			print("sua pontuacao e 100%. obrigado")
		else:
			print("voce errou")
	elif escolha == "4":
		valora = random.randint(0,101)
		valorb = random.randint(0,101)
		result = round(valora / valorb)
		print("Digite sua resposta do valor inteiro: ")
		resp = int(input(f"{valora} / {valorb} = "))
		if resp == result:
			print("corrigir.")
			print("."*10)
			print("sua pontuacao e 100%. obrigado")
		else:
			print("voce errou")
	else:
		print("sair")
		break
	time.sleep(2)

