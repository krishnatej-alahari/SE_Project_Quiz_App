import tkinter
import random 
import subprocess
import requests
import _thread
import time

window = tkinter.Tk()
hostname = 'radiant-castle-73161.herokuapp.com'

def RandomNumber():
    MyRandom = random.randint(10000,90000)
    return MyRandom

def startSession():

    url = 'https://'+hostname+'/signin/startSession'
    try :
        requests.post(url, data = {})
    except:
        print('urlerror')
    message.configure(text="Quiz session started, All the best!")
    MyButton.pack_forget()
    try: 
      _thread.start_new_thread(close_windows,())
    except:
      print('Failed to start close_windows')

def close_windows():
    while True:
        subprocess.call('taskkill /F /IM winword.exe', shell=False)
        subprocess.call('taskkill /F /IM AcroRd32.exe', shell=False)
        subprocess.call('taskkill /F /IM POWERPNT.EXE', shell=False)
        subprocess.call('taskkill /F /IM RdrCEF.exe', shell=False)
        subprocess.call('taskkill /F /IM Telegram.exe', shell=False)
        subprocess.call('taskkill /F /IM notepad.exe', shell=False)
        update_time()
        time.sleep(1)

def update_time():
    url = 'https://'+hostname+'/signin/updateTime'
    try:
        requests.post(url, data = {})
    except:
        print('urlerr..................')

MyTitle = tkinter.Label(window, text="Quiz Client",font="Helvetica 16 bold")
MyTitle.pack()


MyButton = tkinter.Button(window, text="Start", command=startSession)
MyButton.pack()
 
message = tkinter.Label(window, font="Helvetica 16 bold")
message.pack()
 
window.mainloop()