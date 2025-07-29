HISTORY_FILE = "history.txt"

def show_history():
    file=open(HISTORY_FILE,'r')
    lines=file.readlines()
    if len(lines)==0:
        print("No history found!")
    else:
        for line in reversed(lines):
            print(line.strip())
    file.close()
    
def clear_history():
    file=open(HISTORY_FILE,'w') # its overwrite and cleared old history
    file.close()
    print("History cleared!")
    
def save_to_history(equation,result):
    file=open(HISTORY_FILE,'a')
    file.write(equation + "=" + str(result) + "\n")
    file.close()
    
def calculate(user_input):
    parts=user_input.split() # it split the input into char of list..
    if len(parts)!=3:
        print('Invalid input. Use format: number operator number (e.g 8 + 8 = 16)')
        return
    
    num1=float(parts[0])
    op=parts[1]
    num2=float(parts[2])
    if op=='+':
        result=num1+num2
    elif op=='-':
        result=num1-num2
    elif op=='*':
        result=num1*num2
    elif op=='/':
        if num2==0:
            print('Can not divide by zero')
            return 
        result=num1/num2
    else:
        print('Invalid operator.USE ONLY +,-,*,/.')
        
    if int(result)==result:
        result=int(result)  # 4.0 -> 4
        print("Result:", result)
    save_to_history(user_input,result)
    
def main():
    print('---Simple Calculator (type history,clear or exit)')
    while True:
        user_input=input("Enter Calculation (+,-,*,/) or command(history,clear,exit)")
        if user_input=='exit':
            print("GoodBye")
            return
        elif user_input=='history':
            show_history()
        elif user_input=='clear':
            clear_history()
        else:
            calculate(user_input)
main()
    
    