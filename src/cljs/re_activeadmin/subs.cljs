(ns re-activeadmin.subs
    (:require-macros [reagent.ratom :refer [reaction]])
    (:require [re-frame.core :as re-frame]))

(re-frame/register-sub
 :config
 (fn [db]
   (reaction (:config @db))))

