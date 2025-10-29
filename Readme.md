# Java Concurrency: Shared Task and Data

his project showcases fundamental Java concurrency principles by having two separate Thread objects execute the same logic defined in a single Runnable instance (ShareRecipe).


Because both threads operate on the same shared counter variable, this code, in a more complex scenario, is susceptible to Race Conditions. For production use, shared mutable data must be protected using synchronization mechanisms (synchronized keyword or AtomicInteger).