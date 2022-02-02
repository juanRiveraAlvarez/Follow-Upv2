import React, { useState } from "react";

interface Taks {
  name:string;
  done:boolean;
}

const App = () => {

  const [task, setTask] = useState<string>("");
  const [tasks, setTasks] = useState<Taks[]>([]);

  const saveTask = (name:string)=>{
    const newTask:Taks[]=[...tasks,{name, done:false}]
    setTasks(newTask)
    setTask("");
  }

  const handleSubmit = (event: React.FormEvent<HTMLFormElement>)=>{
    event.preventDefault();
    saveTask(task);
    console.log(tasks)
  }
  return (
    <>
      <form onSubmit={handleSubmit}>
        <p>{task}</p>
        <input type="text" value={task} onChange={e => setTask(e.target.value)} />
        <button>Save</button>
      </form>
      {
        tasks.map((e:Taks)=><p key={e.name}>{e.name}</p>)
      }
    </>
  );
}

export default App;
