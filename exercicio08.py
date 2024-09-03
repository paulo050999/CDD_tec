time1 = input("Insira o nome do time 1:")
time2 = input("Insira o nome do time 2:")
gols_do_time_1 = int(input("Insira os gols do time 1:"))
gols_do_time_2 = int(input("Insira os gols do time 2:"))

if gols_do_time_1 > gols_do_time_2:
    print (time1, "venceu o jogo")

elif gols_do_time_1 == gols_do_time_2:
    print ("o resultado foi empate")

else:
    print (time2, "venceu o jogo")
